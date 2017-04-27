/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examp.pkg1;

/**
 *
 * @author Giadinhnho
 */
public class Examp1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    java.awt. *;     
 java.awt.event. *; 
public class AWTCounter mở rộng Frame implements ActionListener {
   Nhãn riêng lblCount;   // Khai báo một thành phần Label  
   private TextField tfCount; // Khai báo một thành phần TextField 
   private Button btnCount;  // Khai báo một thành phần Button 
   int riêng count = 0;    // giá trị của Counter
   Công khai AWTCounter () {
      SetLayout (FlowLayout mới ());
      LblCount = new Label ("Counter"); / / Xây dựng thành phần Label 
      add (lblCount);                   / / "Siêu" Frame container thêm Label component
 
      TfCount = new TextField ("0", 10); // xây dựng thành phần TextField 
      tfCount.setEditable (false);      / / Thiết lập chỉ đọc 
      (tfCount);                    / / "Siêu" Khung chứa thêm thành phần TextField
 
      BtnCount = new Button ("Count");  / / Xây dựng thành phần Button 
      (btnCount);                   // "siêu" Khung chứa thêm Thành phần nút
 
      BtnCount.addActionListener (này);
 
      SetTitle ("Bộ đếm AWT"); / / "Siêu" Khung thiết lập tiêu đề của nó 
      setSize (250, 100);       / / "Siêu" Khung thiết lập kích thước cửa sổ ban đầu của nó
     / / System.out.println (this);
 
      SetVisible (đúng);        / / "Siêu" Khung hình hiển thị
 
     // System.out.println (this); 
     // System.out.println (lblCount); 
     // System.out.println (tfCount); 
     // System.out.println (btnCount);
   }
 
   // Phương thức main ()
   Public static void main (Chuỗi [] args) {
      // Gọi cấu tạo để thiết lập GUI, bằng cách cấp phát một cá thể
      Ứng dụng AWTCounter = new AWTCounter ();
         // hoặc đơn giản là "mới AWTCounter ();" Cho một ví dụ vô danh
   }
 
   // ActionEvent handler - Được gọi lại khi nhấn nút.
   @Ghi đè
   Public void actionPerformed (ActionEvent evt) {
      ++ đếm; // Tăng giá trị đếm 
     // Hiển thị giá trị đếm trên TextField tfCount 
      tfCount.setText (count + ""); // Chuyển đổi int sang String
   }

}
