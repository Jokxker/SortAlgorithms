public class SortConfluence {
    public int[] sort(int[] arr) {
        if (arr == null) return null;
        if (arr.length < 2) return arr;
        int index = 0;
        int[] arrL = new int[arr.length / 2];
        int[] arrR = new int[arr.length / 2 + 1];
        if (arr.length % 2 == 0) {
            arrL = new int[arr.length / 2];
            arrR = new int[arr.length / 2];
        }
        for (int i = 0;i < arr.length;i++) {
            if (i < arr.length / 2) {
                arrL[i] = arr[i];
            } else {
                arrR[index] = arr[i];
                index++;
            }
        }
        arrL = sort(arrL);
        arrR = sort(arrR);

        return confluence(arrL, arrR);
    }

    public int[] confluence(int[] arrL, int[] arrR) {
        int[] arrRes = new int[arrL.length + arrR.length];
        int indArrL = 0;
        int indArrR = 0;
        for (int i = 0;i < arrRes.length;i++) {
            if (indArrL == arrL.length) {
                arrRes[i] = arrR[indArrR];
                indArrR++;
            } else if (indArrR == arrR.length) {
                arrRes[i] = arrL[indArrL];
                indArrL++;
            } else if (arrL[indArrL] < arrR[indArrR]) {
                arrRes[i] = arrL[indArrL];
                indArrL++;
            } else {
                arrRes[i] = arrR[indArrR];
                indArrR++;
            }
        }
        return arrRes;
    }
}
