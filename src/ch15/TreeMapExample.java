package ch15;

import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;
import java.util.NavigableMap;

public class TreeMapExample {
	
	//TreeMap
	// - 이진 트리 기반으로 한 Map 컬렉션.
	// - 부모의 키를 기반으로 낮은 것은 왼쪽, 높은것은 오른쪽

	public static void main(String[] args) {
		// TreeMap 컬렉션 생성
		TreeMap<String, Integer> treemap = new TreeMap<>();
		
		// 값 저장
		treemap.put("apple", 10);
		treemap.put("forever",60);
		treemap.put("description",40);
		treemap.put("ever", 50);
		treemap.put("zoo", 80);
		treemap.put("base", 200);
		treemap.put("guess", 70);
		treemap.put("cherry", 30);
		
		// 정렬된 값을 하나씩 불러오기
		Set<Entry<String,Integer>> entSet=treemap.entrySet();
		for(Entry<String,Integer> entry:entSet){
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		
		// 특정 키에 대한 값 가져오기
        Entry<String, Integer> entry = null;
		// firstEntry()
		entry = treemap.firstEntry();
		System.out.println("제일 앞 단어 : " + entry.getKey() + "-" + entry.getValue());
		// lastEntry()
		entry = treemap.lastEntry();
		System.out.println("제일 뒤 단어 : " + entry.getKey() + "-" + entry.getValue());
		// lowerEntry(key)
		entry = treemap.lowerEntry("ever");
		System.out.println("ever 앞 단어 : " + entry.getKey() + "-" + entry.getValue());
		
		// 내림차순으로 정렬
		NavigableMap<String, Integer> descendingMap = treemap.descendingMap();
		Set<Entry<String, Integer>> descendingEntrySet = descendingMap.entrySet();
		for (Entry<String, Integer> e: descendingEntrySet) {
			System.out.println(e.getKey() +"-"+e.getValue());
		}
		System.out.println();
		
		// 범위 검색 subMap(시작값,포함여부(boolean), 끝값,포함여부(boolean)
		// c <= x <h
		NavigableMap<String, Integer> rangeMap = treemap.subMap("c", true, "h", false);
		for (Entry<String, Integer> e: rangeMap.entrySet() ) {
			System.out.println(e.getKey()+"-"+e.getValue());
		}
		System.out.println();
		}
		
	}

