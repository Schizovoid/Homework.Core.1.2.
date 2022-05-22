package Homework.JavaCore2.Homework5;

import java.util.Arrays;

public class Threads {
    static final int size = 10000000;
    static final int h = size / 2;

        public static void main(String[] args) throws InterruptedException {
            float[] arr = new float[size];
            oneThreadCompute(arr);
            float[] arr2 = new float[size];
            twoThreadCompute(arr2);
            System.out.println(Arrays.equals(arr,arr2));
        };

        public static void oneThreadCompute(float[] arr) throws InterruptedException {
            long a = System.currentTimeMillis();
            Arrays.fill(arr, 1);
            sequentialMethod(arr, 0);
//            for (int i = 0; i < arr.length; i++) {
//                arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
//            }
            System.out.println("Время выполнения программы: " + (System.currentTimeMillis() - a));
        }

        public static synchronized void twoThreadCompute(float [] arr2) throws InterruptedException {
            long a = System.currentTimeMillis();
            Arrays.fill(arr2, 1);
            float[] a1 = Arrays.copyOfRange(arr2, 0, h);
            float[] a2 = Arrays.copyOfRange(arr2, h, arr2.length);

//            System.arraycopy(arr2, 0, a1, 0, h);
//            System.arraycopy(arr2, h, a2, 0, h);
            Thread t1 = new Thread(() -> {
    sequentialMethod(a1, 0);
        System.out.println(a1[a1.length-1]);
    });
//                @Override
//                public void run(){
//                    System.out.println(a1[0]);
//                    for (int i = 0; i < a1.length; i++) {
//                        a1[i] = (float) (a1[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
//                    }
//                    System.out.println(a1[a1.length-1]);
//                }
//            };
            //                @Override
//                public void run (){
//                    a2[0] = a1[a1.length-1];
//                    System.out.println(a2[0]);
//                    for (int i = 0; i < a2.length; i++) {
//                        a2[i] = (float) (a2[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
//                    }
//                    System.out.println(a2[a2.length-1]);
//                }
            Thread t2 = new Thread(() -> {
                sequentialMethod(a2, h);
                System.out.println(a2[a2.length-1]);
            });
            t1.start();
            t2.start();
            try {
            t1.join();
            t2.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
                return;
            }
            System.arraycopy(a1, 0, arr2, 0, h);
            System.arraycopy(a2, 0, arr2, h, h);
            System.out.println("Время выполнения программы: " + (System.currentTimeMillis() - a));
        }
    private static float computeValue(int index, float currentValue) {
        return (float) (currentValue * Math.sin(0.2f + index / 5.0) * Math.cos(0.2f + index / 5.0) * Math.cos(0.4f + index / 2.0));
    }
    private static void sequentialMethod(float[] arr, int offset) {
        for (int index = 0; index < arr.length; index++) {
            float currentValue = arr[index];
            arr[index] = computeValue(index + offset, currentValue);
        }
    }
    }
