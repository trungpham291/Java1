package day4;

import java.util.ArrayList;

public class MainDay4 {
    public static void main(String[] args) {
        //    Collection
//        Tạo ra một arrayList student dùng để chứa danh sách sinh viên
        ArrayList<Student> danhSachSinhVien = new ArrayList<>();
//        Tạo ra đối tượng cự thể của lớp student
        Student st1 = new Student(7, "Hung", "Dao");
//        Đưa ra đối tượng vào danh sách
        danhSachSinhVien.add(st1);
        Student st2 = new Student(4, "Luyen", "Dao");
        danhSachSinhVien.add(st2);
        Student st3 = new Student(1, "Hong", "Dao");
        danhSachSinhVien.add(st3);
        Student st4 = new Student(11, "Huyen", "Dao");
        danhSachSinhVien.add(st4);
        Student st5 = new Student(15, "Hoang", "Dao");
        danhSachSinhVien.add(st5);
//  Tạo biến để lưu index của phần tử tìm được
        int searchIndex = -1;
//        tạo biến lưu từ khóa tìm kiếm
//        tìm sinh viên có id = 15;
        long searchKey = 15;
//  forsearch, duyệt qua các phần tử của List
        for (int i = 0; i < danhSachSinhVien.size(); i++) {
//            Lấy ra phần tử tại index thứ 1
            Student student = danhSachSinhVien.get(i);
        // so sánh nếu trùng từ khóa
            if (student.getId() == searchKey) {
        // Lưu lại index của phần tử.
                searchIndex = i;
                System.out.println(searchIndex);
            }
//            gán giá trị ra biến name và in ra,
//            System.out.printf("Student: %d - %s %s\n", student.getId(), student.getLastname(), student.getFirstname());

        }
//      xóa phần tử khỏi danh sách theo index tìm đc
        if (searchIndex == -1) {
            System.out.println("Khong tim thay sinh vien.");
        } else {
            danhSachSinhVien.remove(searchIndex);
            System.out.println("Xoa Thanh Cong sinh vien.");
        }

        for (int i = 0; i < danhSachSinhVien.size(); i++) {
//            Lấy phần tử rừ index thứ 1
            Student student = danhSachSinhVien.get(i);
//            gán giá trị ra biến name và in ra
            System.out.printf("Student: %d - %s %s\n", student.getId(), student.getLastname(), student.getFirstname());
        }


//        ArrayList<String> danhSachSinhVien = new ArrayList<>();
//        danhSachSinhVien.add("Hung");
//        danhSachSinhVien.add("Luyen");
//        danhSachSinhVien.add("Nhung");
//        danhSachSinhVien.add("Dao");
////        Lấy ra size
//        System.out.println(danhSachSinhVien.size());
////        xóa đi phần tử tại index thư 2
//        danhSachSinhVien.remove(2);
////        in ra size lần nữa
//        System.out.println(danhSachSinhVien.size());
////        foreach , duyệt qua các phần tử của List
//        for (int i =0; i < danhSachSinhVien.size(); i++) {
////            lấy ra phần tử tại index thứ i
//            String name = danhSachSinhVien.get(i);
////            lấy giá trị ra biến name và in ra
//            System.out.println(name);


    }
}

