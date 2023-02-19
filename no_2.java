import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class no_2 {

    public static void main(String[] args) {

        // a. List Nama makanan minimal 10 data
        List<String> foodList = new ArrayList<>();
        foodList.add("Nasi Goreng");
        foodList.add("Nasi Bakar");
        foodList.add("Nasi Padang");
        foodList.add("Nasi Lemak");
        foodList.add("Bubur Ayam");
        foodList.add("Gulai");
        foodList.add("Sate Taican");
        foodList.add("Bebek Bakar");
        foodList.add("Sate Kikil");
        foodList.add("Ketoprak");

        System.out.println("List Nama Makanan:");
        for (String food : foodList) {
            System.out.println(food);
        }

        // b. List Tahun Piala Dunia minimal 3 data
        List<Integer> worldCupYears = new ArrayList<>();
        worldCupYears.add(2018);
        worldCupYears.add(2014);
        worldCupYears.add(2010);

        System.out.println("\nList Tahun Piala Dunia:");
        for (int year : worldCupYears) {
            System.out.println(year);
        }

        // c. Implement sort pada list nama provinsi minimal 10 data secara descending
        List<String> provinceList = new ArrayList<>();
        provinceList.add("Jawa Tengah");
        provinceList.add("Jawa Barat");
        provinceList.add("Jawa Timur");
        provinceList.add("Sumatera Utara");
        provinceList.add("Aceh");
        provinceList.add("Banten");
        provinceList.add("Kalimantan Barat");
        provinceList.add("Sulawesi Selatan");
        provinceList.add("Papua Barat");
        provinceList.add("Nusa Tenggara Timur");

        System.out.println("\nList Nama Provinsi sebelum diurutkan:");
        for (String province : provinceList) {
            System.out.println(province);
        }

        Collections.sort(provinceList, Collections.reverseOrder());

        System.out.println("\nList Nama Provinsi setelah diurutkan secara descending:");
        for (String province : provinceList) {
            System.out.println(province);
        }

        // d. Implement penghapusan data untuk 5 data yang berbeda dari list bahasa pemograman yang berisikan 12 data
        List<String> programmingLanguages = new ArrayList<>();
        programmingLanguages.add("Java");
        programmingLanguages.add("Python");
        programmingLanguages.add("C++");
        programmingLanguages.add("JavaScript");
        programmingLanguages.add("Ruby");
        programmingLanguages.add("Golang");
        programmingLanguages.add("Swift");
        programmingLanguages.add("Kotlin");
        programmingLanguages.add("PHP");
        programmingLanguages.add("Visual Basic");
        programmingLanguages.add("HTML");
        programmingLanguages.add("CSS");

        System.out.println("\nList Bahasa Pemrograman sebelum dihapus:");
        for (String language : programmingLanguages) {
            System.out.println(language);
        }

        programmingLanguages.remove("Python");
        programmingLanguages.remove("Ruby");
        programmingLanguages.remove("Visual Basic");
        programmingLanguages.remove("HTML");
        programmingLanguages.remove("CSS");

        System.out.println("\nList Bahasa Pemrograman setelah dihapus:");
        for (String language : programmingLanguages) {
            System.out.println(language);
        }
    }
}
