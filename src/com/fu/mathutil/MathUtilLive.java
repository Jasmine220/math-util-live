
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.fu.mathutil;

/**
 *
 * @author Administrator
 */
public class MathUtilLive {

    public static void main(String[] args) {
        long result = MathUtil.getFatorial(5);
        System.out.println("expected: 5! = 120; actual: " + result);
        System.out.println("expected: 6! = 720; actual: " + MathUtil.getFatorial(6));
        System.out.println("expected: 0! = 1; actual: " + MathUtil.getFatorial(0));
        //kĨ thuật kiểm thử pm: ước lượng xem gtri thực tế là gì
        //expected value: 5! = 120
        //mày/hàm ai đó viết khi chạy thực tế là mấy - actual: giả sử 120
        //if expected == actual, hàm ngon trong tình huống này
        //MathUtil.getFatorial(-5); ném ngoại lệ
                System.out.println("expected: 5! = 120; actual: " + result);
        System.out.println("expected: 5! = 120; actual: " + result);

        
        

    }

}
