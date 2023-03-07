package com.example.zerobase.binarySearch;

public class Practice1 {

    static int solution(int[] arr, int target) {
        int sIdx = 0;
        int eIdx = arr.length - 1;

        return binarySearch(arr, target, sIdx, eIdx);
    }

    static int binarySearch(int[] arr, int target, int sIdx, int eIdx) {
        if (sIdx >= eIdx) {
            // 못찾았을 떄
            return sIdx  * -1 -1;
        }
        int mid = (sIdx + eIdx) / 2;
        if (arr[mid] == target) return mid;
        if (arr[mid] > target) {
            return binarySearch(arr, target, sIdx, mid - 1);    // -1
        } else {
            return binarySearch(arr, target, mid + 1, eIdx); // +1
        }
    }



    public static void main(String[] args) {
        int[] arr = new int[] {1, 2, 5, 10, 20, 30, 40, 50, 60};

        System.out.println(solution(arr, 50));
        System.out.println(solution(arr, 3));
    }
}
