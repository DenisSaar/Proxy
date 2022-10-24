class Regi {
    public static void main (String[] args) {
        double[] nums = new double[]{18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32 , 33, 34, 35, 36, 20, 19, 22, 23, 24, 25,};
        double result = 0;
        int i;
        for (i=0; i<25; i++) {
            result = result + nums[i];
        }
        System.out.println("средний возраст играков первой команды" + result / 25);
        double[] nums2 = new double[]{18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 24, 29, 19, 31, 18 , 33, 34, 35, 36, 20, 20, 22, 23, 24, 25,};
        double result2 = 0;
        int a ;
        for (a=0; a<25; a++)
            result2 = result2 + nums2[a];
        System.out.println("средний возраст играков второй команды" + result2 / 25);
    }
}