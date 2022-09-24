public class Main {
    public static void main(String[] args) {
    char grade = 'F';

    switch (grade){
        case 'A':
            System.out.println("Mükemmel : Geçtiniz");
        case 'B':
            System.out.println("Çok Güzel : Geçtiniz");
        case 'C':
            System.out.println("İyi : Geçtiniz");
        case 'D':
            System.out.println("Fena Değil : Geçtiniz");
        case 'F':
            System.out.println("Maalesef Kaldınız");
            break;
        default:
            System.out.println("Geçersiz Not Girdiniz!");

    }
    }
}