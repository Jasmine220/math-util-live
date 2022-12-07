/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fu.mathutil;

/**
 *
 * @author Administrator
 */
//TA VIEETS ĐỂ CUNG CẤP TIỆN ÍCH CHO NƠI KHÁC XÀI
// KHI TA CUNG CẤP TIỆN ÍCH CHO NƠI KHÁC XÀI, TA KO CẦN
//NHỚ CÁI GÌ CHO RIÊNG TA, HÀM STATIC GIÚP LÀM ĐIỀU NÀY
public class MathUtil {

    //n! = 1.2.3.5...n
    //O! = 1! = 1
    //ko tính đc giai thừa cho số âm
    //20! là vừa khớp kiểu long, kiểu long chỉ tối da 18 số 0
    //21! là lố kiểu long
    //nếu đưa vào (-) or 21!, ta mếu tính, ta đập voà 
    //mặt ai xài hàm 1 exception: "khum tính đc"
    public static long getFatorial(int n) {
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("Invalid argument. n must be between 0 and 20");
        }
        //hàm dừng liền éo cần return

        //xuống đây là n = 0..20 rồi
        if (n == 0 || n == 1) {
            return 1;//dừng ngay khi n đặc biệt
        }        //xuống đến đây, n = 2..20 òi
        //chơi for hoặc đệ quy - recursion
        //kĩ thuật nhồi con heo đất
        //i = 2, i = 3, i = 4, i = 5  nhồi liên tục i vào tích
        long product = 1;//tích khởi đầu = 1, nhồi dần vào
        for (int i = 2; i <= n; i++) {
            product *= i;
        }//nhân từ 2 -> n
        return product;
    }
}
