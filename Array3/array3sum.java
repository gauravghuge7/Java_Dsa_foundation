
class array3sum {

    public static void twoSum(int[] arr) {

        int ans=0;
        for(int i=0; i<arr.length; i++) {

            for(int j=(i+1); j<arr.length; j++) {

                if(arr[i] + arr[j] == 8) {
                    ans++;
                }
            }
        }

        System.out.println(ans);

    }

    static int maxvalue(int[] arr) {

        int mx = Integer.MIN_VALUE;

        for (int i=0; i<arr.length; i++) {
            if(arr[i] > mx) {
                mx=arr[i];
            }
        }
        return mx;
    }

    static int secondLargest(int[] arr) {

        int mx = maxvalue(arr);
        for (int i=0; i<arr.length; i++) {
            if(arr[i] == mx ) {
                arr[i] = Integer.MIN_VALUE;
            }
        }
         int secondLarge = maxvalue(arr);
        System.out.println(secondLarge);
        return secondLarge;
    }


    static int unique(int[] arr) {

        int n = arr.length;

        for (int i=0; i<n; i++) {
            for (int j=i+1; j<n; j++) {
                if(arr[i] == arr[j]) {
                    arr[i] = arr[j] =-1;
                }
            }
        }

        for(int i=0; i<n; i++ ) {

            if(arr[i] > 0) {
//                System.out.println(arr[i]);
                return arr[i];
            }
        }

        return -1;


    }



    public static void main(String[] args) {

        int[] arr= {2, 3, 4,4,3};

//        twoSum(arr);
//        secondLargest(arr);

        System.out.println(unique(arr));

    }
}