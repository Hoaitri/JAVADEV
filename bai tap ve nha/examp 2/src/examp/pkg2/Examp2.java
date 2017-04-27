/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examp.pkg2;

/**
 *
 * @author Giadinhnho
 */
public class Examp2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    java.awt. *;       
 java.awt.event. *; 
lớp container cao cấp java.awt.Frame public class AWTAccumulator mở rộng Frame implements ActionListener {
   Nhãn private lblInput;    
   private Label lblOutput;   
   private TextField tfInput; 
   cá nhân TextField tfOutput;
   private int sum = 0;       
 
   Công cộng AWTAccumulator () {
      SetLayout (FlowLayout mới ());
      LblInput = new Label ("Nhập một Integer:"); / / Xây dựng nhãn 
      add (lblInput);              / / "Siêu" Frame container thêm Label component
 
      TfInput = new TextField (10); // Xây dựng TextField 
      add (tfInput);               // "siêu" Khung Thêm TextField
 
      TfInput.addActionListener (này);
      LblOutput = new Label ("Số tích luỹ là:"); // phân bổ Label 
      add (lblOutput);              // "super" Frame thêm Label
 
      TfOutput = new TextField (10); // phân bổ TextField 
      tfOutput.setEditable (false); // read-only 
      add (tfOutput);               // "siêu" Khung Thêm TextField
 
      SetTitle ("AWT Accumulator"); // "super" Bộ khung tiêu đề 
      setSize (350, 120); / / "Siêu" Khung thiết lập kích thước cửa sổ ban đầu 
      setVisible (true);  / / "Siêu" Khung hình hiển thị
   }
 
   // Phương thức main ()
   Public static void main (Chuỗi [] args) {
      / / Gọi constructor để thiết lập GUI, bằng cách phân bổ một thể hiện vô danh
      Mới AWTAccumulator ();
   }
 
   // ActionEvent handler - Được gọi trở lại khi nhấn phím "enter" trên TextField
   @Ghi đè
   Public void actionPerformed (ActionEvent evt) {
      // Lấy Chuỗi nhập vào Textfield tfInput, chuyển đổi sang int
      Int numberIn = Integer.parseInt (tfInput.getText ());
      Sum + = numberIn;     / / Tích lũy số lượng nhập vào tổng 
      tfInput.setText (""); 
      tfOutput.setText (sum + ""); 
                                 
   }
}
}
