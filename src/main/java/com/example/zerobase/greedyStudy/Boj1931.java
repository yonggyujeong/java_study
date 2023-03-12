package com.example.zerobase.greedyStudy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Boj1931 {
    
    // 수정
    // 정렬 from , to 둘다 오름차순
    // int -> long (int 는 +-2^16)
    // from == to 동일할 경우 candidate에 추가

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        List<Study> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {

            int fromTime = sc.nextInt();    // nextInt 활용법 **
            int toTime = sc.nextInt();
            list.add(new Study(fromTime, toTime));
        }
        list.sort((o1, o2) -> {
            if (o1.to == o2.to) {
                return Long.compare(o1.from, o2.from);      // compare 함수로 비교한다.
            }
            return Long.compare(o1.to, o2.to);
        });

        // 같은 시작시간을 가지는 것 중 가장 빨리 끝나는 것들 ( 선택될 수 있는 후보 수업들)
        List<Study> candidate = new ArrayList<>();
        long pre = -1;
        for (int i = 0; i < N; i++) {
            if (list.get(i).from == list.get(i).to) {
                candidate.add(list.get(i));
            }
            else if (list.get(i).from > pre) {
                pre = list.get(i).from;
                candidate.add(list.get(i));
            }
        }

        //System.out.println(candidate);

        int maxCount = 0;
        for (int i = 0; i < candidate.size(); i++) {
            int cnt = findStudyCount(i, candidate);
            if (maxCount <= cnt) {
                maxCount = cnt;
            } else {
                break;
            }
        }


        System.out.println(maxCount);
    }

    static class Study {
        long from;
        long to;

        public Study(long from, long to) {
            this.from = from;
            this.to = to;
        }

        @Override
        public String toString() {
            return "from:" +from + " to:"+to;
        }
    }

    static boolean isStudyable(Study preStudy, Study study) {
        if (preStudy == null) return true;
        if (preStudy.to <= study.from) {
            return true;
        }
        return false;
    }

    static int findStudyCount(int StartIdx, List<Study> candidate) {
        Study preStudy = null;
        int cnt = 0;
        for (int i = StartIdx; i < candidate.size(); i++) {
            Study study = candidate.get(i);
            if (isStudyable(preStudy, study)) {
               // System.out.println(study);
                cnt += 1;
                preStudy = study;
            }
        }
        return cnt;
    }
}
