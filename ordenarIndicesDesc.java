import java.util.Arrays;

//Metodo en el que se debe ordenar desendentemente unos numeros de un arereglo y luego en otro arreglo devolver los indices correspondientes

public class Test{
public static void swap(int[] a, int i, int j) {
    int t = a[i];
    a[i] = a[j];
    a[j] = t;
}

public static void qs(int[] indexes, int[] arr, int start, int end) {
    if (start >= end)
        return;

    int pivot = arr[end - 1];
    int wall = start;

    for (int i = start; i < end; ++i) {
        if (arr[i] >= pivot) {
            swap(arr, i, wall);
            swap(indexes, i, wall);
            ++wall;
        }
    }

    qs(indexes, arr, start, wall - 1);
    qs(indexes, arr, wall, end);
}

public static int[] qs(int[] arr) {
    int[] indexes = new int[arr.length];
    for (int i = 0; i < arr.length; indexes[i] = i++) ;

    qs(indexes, arr, 0, arr.length);
    return indexes;
}

public static void main(String... args) {
    int[] arr = {2,5,1};
    int[] idxs = qs(arr);
    System.out.println(Arrays.toString(idxs));
    System.out.println(Arrays.toString(arr));
}
}
