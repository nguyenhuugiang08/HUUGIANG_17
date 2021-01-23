package com.company;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {

        Scanner nhap = new Scanner(System.in);
        int n;
        int[] a;
        do {
            System.out.println("nhap so phan tu cua mang: ");
            n = nhap.nextInt();
            if (n < 0)
                System.out.println("nhap lai n !");
        } while (n < 0);
        a = new int[n+1];
        for (int i = 0; i < n; i++) {
            System.out.printf("nhap phan tu thu " + (i + 1) + " = " + "\n");
            a[i] = nhap.nextInt();
        }
        int luachon;
        do {
            System.out.println("\n=====MENU=====\n1.hien thi mang vua tao\n2.them phan tu k\n3.xoa phan tu\n4.dao nguoc mang" +
                    "\n5.hien thi phan tu a[i] va cac so chia het cho no\n0.thoat\nban chon ?");
            luachon = nhap.nextInt();

            switch (luachon) {
                case 0: {
                    break;
                }
                case 1: {
                    System.out.println("mang vua nhap la: ");
                    for (int i = 0; i <  n; i++) {
                        System.out.printf(a[i] + " ");
                    }
                }
                break;
                case 2: {
                    int k, b;
                    do {
                        System.out.printf("nhap vi tri can chen: ");
                        k = nhap.nextInt();
                        if (k > n)
                            System.out.println("vui long nhap lai k!");
                    } while (k > n);
                    System.out.printf("nhap phan tu can chen: ");
                    b = nhap.nextInt();
                    for (int i = n; i > k; i--) {
                        a[i] = a[i - 1];
                    }
                    a[k] = b;
                    System.out.println("mang sau khi chen la: ");
                    for (int i = 0; i < n+1; i++) {
                        System.out.printf(a[i] + " ");
                    }
                }
                break;
                case 3: {
                    int k;
                    do {
                        System.out.printf("nhap vi tri can xoa: ");
                        k = nhap.nextInt();
                        if (k >= n)
                            System.out.println("vui long nhap lai k!");
                    } while (k >= n);
                    for(int i=k; i< n-1 ;i++)
                    {
                        a[i] = a[i+1];
                    }
                    System.out.println("mang sau khi xoa la: ");
                    for (int i = 0; i < n-1; i++) {
                        System.out.printf(a[i] + " ");
                    }
                }
                break;
                case 4: {
                    System.out.println("mang sau khi dao nguoc la: ");
                    for (int i =0; i <n; i++) {
                        System.out.printf(a[n-1-i] + " ");
                    }
                }
                break;
                case 5 :{

                    System.out.println("gia tri a[1] = "+ a[1]);
                    for(int i=0 ; i<n; i++)
                    {
                        if(a[i]%a[1]==0)
                            System.out.printf("cac so chia het cho a[1] la : "+ a[i] + " ");
                    }
                }
                break;
                default:
                    break;
            }
        } while (luachon != 0);
    }
}
