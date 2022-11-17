package day32maps;

public class Students {

    public String name;
    public String email;
    public int age;
    public boolean success;

    //ogrenci olustururken artik isim yas mail basari'yi ekleyebilecegim.dinamik bir yapida oldu.
    public Students(String name, String email, int age, boolean success) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.success = success;

    }

    //toString methodu bu class dan olsuturdugumuz objelerin detaylarini bize yazar.
    //datayi okunabilir gormek istersen toString koymalisin olmazsa bize HashCode verir.

    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", success=" + success +
                '}';
    }
}
