package Demo;

public class Class {
    public static int[] moveArray(int start, int[] arr) {
        int[] arrr = new int[arr.length - 1];
        for (int i = 0; i < arr.length - 1; i++) {
            if(i < start) arrr[i] = arr[i];
            else arrr[i] = arr[i + 1];
        }
        return arrr;

    }

    public static int [] iliminate(int[] arr) {
        int l = arr.length;
        int check=0;
        int[] a = arr;
        for (int i = 0; i < l-1; i++) {
            if(arr[i+1]>arr[i]) check++;   // Kiễm tra liệu có phần tử trùng nhau không
            else {
                a = moveArray(i, arr); // Nếu bằng thì loại bỏ và dời các phần tử sau lên
                break;
            }
        }
        if (check==l-1) { // Nếu toàn bộ mảng không có element trùng thì check = số lần kiễm tra mảng từ đầu đến cuối
            return a;
        } else return iliminate(a); // chổ này là đệ quy
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 5, 5, 6, 6, 6, 8, 8};


        arr = iliminate(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }

    }
}
