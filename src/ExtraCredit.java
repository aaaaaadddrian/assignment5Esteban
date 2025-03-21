public class ExtraCredit {

    public static void main(String[] args) {
        int[] A = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 19};
        int K = 20;

        for(int i : findSubArray(A, K)){
            System.out.print(i);
        }

    }

    public static int[] findSubArray(int[] A, int K){
        int point = 0;
        int sum = 0;

        for(int i = 0; i < A.length; i++){
            sum += A[i];
            while(sum >= K){
                sum -= A[point];
                point++;
                if(sum == K){
                    return new int[]{point, i};
                }
            }
        }
        return new int[]{-1, -1};
    }

}
