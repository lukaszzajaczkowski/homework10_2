package pl.testuj;


/*
- stworzyć klasy PrivateContact oraz WorkContact - dziedziczące
po PhoneContact

- wyświetlenie kontaktu
- wyślij jako wizytówka zaimplementować metodę send()

Wykorzystując polimorfizm stworzyć tablicę przechowującą kilka kontaktów różnego typu
i na każdym kontakcie wywołać metodę print()



 */

public class Main {

    public static void main(String[] args) {
        MobileContact mobileContact = new MobileContact(1,
                "Wojtek", "Nowak", "123456789");

        mobileContact.print();
    }
}
