package ch19;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketAddress;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SeverExample2{

// TCP 서버 프로그램 동작

// ServerSocket 객체 멤버 생성
private static ServerSocket serverSocket = null;
//스레드풀 생성 .. (스레드 숫자 제한 :10)
private static ExecutorService executorService = Executors.newFixedThreadPool(10);

public static void main(String[] args) {
   
   System.out.println("-------------------------------------------------");
   System.out.println("서버를 종료하려면 q를 입력하고 Enter 키를 입력하세요. ");
   System.out.println("-------------------------------------------------");
   
   // TCP 서버 시작
   startServer();
   
   // 키보드 입력
   Scanner scan = new Scanner(System.in);
   while(true) {
      String key = scan.nextLine();
      if (key.toLowerCase().equals("q")) {
         break;
      }
   }
   scan.close();
   
   // TCP 서버 종료
   stopServer();
   

}

public static void startServer() {
   // 작업 스레드 정의
   Thread thread = new Thread() {
      // 스레드 동작 정의
      public void run() {
         // 서버 작업을 위한 코드
         try { // 입출력 예외를 위한 try ~ catch
            // ServerSocket 생성 및 Port 바인딩
            // 1. 생성자를 이용한 포트 바인딩
            serverSocket = new ServerSocket(50001);
            System.out.println("[서버]가 시작됨");
            
            while(true) {  // 연결이 언제 될지 몰라요... 
               System.out.println("\n[서버] 연결 요청 기다림\n");
               // 2. accept()를 이용해서 연결 수락을 기다림... 
               // 연결되면 Socket 객체를 반환
               Socket socket = serverSocket.accept();
               
               // 3. 서버 연결후 작업
               // 연결된 클라이언트 정보 얻기
               InetSocketAddress isa = (InetSocketAddress)socket.getRemoteSocketAddress();
               System.out.println("[서버] " + isa.getHostName() + "의 연결 요청을 수락함");
               
               // 전송 데이터 받기
               InputStream is =socket.getInputStream();
               // 데이터 처리를 위한 공간 설정
               // DataInputStream 이용
               DataInputStream dis = new DataInputStream(is);
               String message = dis.readUTF();
//               byte[] bytes =new byte[1024];
//               int readByteCount = is.read(bytes);
//               String message = new String(bytes,0,readByteCount,"UTF-8");
               System.out.println("[서버] 클라이언트에게 받은 데이터 : " + message);
               
               // 데이터 전송하기
               String sendMessage = "점심뭐먹지";
               // getOutputStram() : OutputStream 객체 반환 - 전송시 내보낼 데이터 처리를 위한
               OutputStream os = socket.getOutputStream();
               
//               byte[] bytes1 = sendMessage.getBytes("UTF-8");
//               os.write(bytes1);
//               os.flush();
               System.out.println("[클라이언트] 에게 데이터 전송 : "+sendMessage);
               
               // 4. 연결 끊기
               socket.close();
               System.out.println("[서버] " + isa.getHostName() + "의 연결을 끊음");
               
            }
         } catch (IOException e) {
            System.out.println("[서버] " + e.getMessage());
         }
      }
      
   };
   // 스레드 시작
   thread.start();
}

public static void stopServer() {
   try {
      // ServerSocket을 닫고, Port 언바인딩
      serverSocket.close();
      System.out.println("[서버] 종료됨");
   } catch (Exception e) {
      // TODO: handle exception
   }
}
}

