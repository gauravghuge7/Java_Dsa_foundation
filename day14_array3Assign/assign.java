class assign2 {

    public static void existNumber(int[] arr, int target) {

        boolean check = false;
        for (int i=0; i<arr.length; i++) {

            if(arr[i] == target) {
                check = true;
                System.out.println("yes");
                break;
            }

        }
        if(!check) {
            System.out.println("no");
        }
    }


    static void howMany(int[] arr, int target) {

        int ans=0;
        for(int i=0; i<arr.length; i++) {
            if(arr[i] == target) {
                ans++;
            }
        }

        System.out.println("the number exists at "+ans+" times");
    }



    public static void findMissing(int arr[], int N)
    {
        int i;
        int temp[] = new int[N + 1];
        for (i = 0; i <= N; i++) {
            temp[i] = 0;
        }

        for (i = 0; i < N; i++) {
            temp[arr[i] - 1] = 1;
        }

        int ans = 0;
        for (i = 0; i <= N; i++) {
            if (temp[i] == 0)
                ans = i + 1;
        }
        System.out.println(ans);
    }

}


class assign extends assign2 {

    public static void main(String[] args) {

//        int[] arr = {5,10,15,10, 20,25};
        int[] arr = {1,2,3,5
                ,6,7,8};
        int x = arr.length;

//        existNumber(arr, x);


//        howMany(arr, x);

        findMissing(arr, x);




    }
}