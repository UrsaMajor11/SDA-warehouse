package com.sda.Warehouse.configs;

import com.sda.Warehouse.models.Category;
import com.sda.Warehouse.models.Product;
import com.sda.Warehouse.models.User;
import com.sda.Warehouse.repositories.JpaCategoryRepository;
import com.sda.Warehouse.repositories.JpaProductRepository;
import com.sda.Warehouse.repositories.JpaUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

/**
 * Created by mytek on 2017-09-02.
 */

@Configuration
public class InitialDataConfig {

    private JpaCategoryRepository jpaCategoryRepository;

    private JpaProductRepository jpaProductRepository;

    private JpaUserRepository userRepository;

    @Autowired
    public InitialDataConfig(JpaCategoryRepository jpaCategoryRepository, JpaProductRepository jpaProductRepository, JpaUserRepository userRepository) {
        this.jpaCategoryRepository = jpaCategoryRepository;
        this.jpaProductRepository = jpaProductRepository;
        this.userRepository = userRepository;
    }

    @PostConstruct
    public void init() {

        userRepository.save(new User("Jan", "Kowalski", "kowalski@wp.pl", "qwerty123", "warehouseman", false));
        userRepository.save(new User("Jan", "Kowalski", "a@a.com", "a", "warehouseman", false));
        userRepository.save(new User("Marcin", "Kowalski", "abc@xyz.com", "abc", "warehouseman", false));

        Category category = new Category("it");
        Category category2 = new Category("cook");
        Category category3 = new Category("novel");
        Category category4 = new Category("young");
        Category category5 = new Category("children");
        Category category6 = new Category("poetry");
        Category category7 = new Category("fantasy");
        Category category8 = new Category("school");

        jpaCategoryRepository.save(category);
        jpaCategoryRepository.save(category2);
        jpaCategoryRepository.save(category3);
        jpaCategoryRepository.save(category4);
        jpaCategoryRepository.save(category5);
        jpaCategoryRepository.save(category6);
        jpaCategoryRepository.save(category7);
        jpaCategoryRepository.save(category8);

        Product product = new Product("Java podstawy",
                "PIERWSZY PRODUKT Najważniejszy praktyczny poradnik i podręcznik dla doświadczonych programistów dążących do " +
                        "doskonalenia swoich umiejętności w zakresie posługiwania się językiem Java.",
                "Rząd 1; miejsce 1",
                15,
                "https://static01.helion.com.pl/global/okladki/326x466/4dbd7b921aa2dafbf867c4ac097d6998,javp10.jpg",
                category);

        Product product1 = new Product("Java w pigułce",
                "Java to język programowania wybierany wszędzie tam, gdzie są wymagane najwyższe bezpieczeństwo i wydajność.",
                "Rząd 1; miejsce 2",
                150,
                "https://static01.helion.com.pl/global/okladki/326x466/06a3d95a2c11220eb256f2b29d604546,javpi6.jpg",
                category);

        Product product2 = new Product("Pamiętnik czarnego noska",
                "Miś zwany Czarnym Noskiem bardzo nudził się na sklepowej witrynie, marzył, żeby jakieś miłe i grzeczne dziecko zabrało go do domu.",
                "Rząd 4; miejsce 1",
                15,
                "http://webimage.pl/pics/184/6/d9788328046184.jpg",
                category5);
        Product product3 = new Product("Szewczyk dratewka",
                "Znana baśń o szewczyku, który musi wykonać trzy trudne zadania, aby uwolnić pannę zamkniętą na wieży przez złą czarownicę. " +
                        "Pomagają mu w tym zaprzyjaźnione z nim zwierzęta.",
                "Rząd 4; miejsce 2",
                15,
                "http://webimage.pl/pics/864/9/d187777.jpg",
                category5);

        Product product4 = new Product("Inwazja",
                "Współczesna Polska, w której żyją: Roman, były żołnierz wojsk specjalnych i uczestnik wielu zagranicznych misji, " +
                        "Danuta kobieta kochająca luksus, ciężko pracująca i całkowicie uzależniona od ojca tyrana oraz Michał, " +
                        "bezrobotny historyk z żoną i dwójką dzieci.",
                "Rząd 2; miejsce 1",
                0,
                "http://webimage.pl/pics/234/4/d857398.jpg",
                category3);

        Product product5 = new Product("Latarnia umarłych",
                "Akcja \"Latarni umarłych\" rozgrywa się w rok po wydarzeniach opisanych w \"Sedinum\" - wiadomość z podziemi.",
                "Rząd 2; miejsce 1",
                15,
                "http://webimage.pl/pics/234/4/d857398.jpg",
                category3);


        Product product6 = new Product("Java podstawy",
                "Najważniejszy praktyczny poradnik i podręcznik dla doświadczonych programistów dążących do " +
                        "doskonalenia swoich umiejętności w zakresie posługiwania się językiem Java.",
                "Rząd 1; miejsce 1",
                15,
                "https://static01.helion.com.pl/global/okladki/326x466/4dbd7b921aa2dafbf867c4ac097d6998,javp10.jpg",
                category);

        Product product7 = new Product("Java w pigułce",
                "Java to język programowania wybierany wszędzie tam, gdzie są wymagane najwyższe bezpieczeństwo i wydajność.",
                "Rząd 1; miejsce 2",
                150,
                "https://static01.helion.com.pl/global/okladki/326x466/06a3d95a2c11220eb256f2b29d604546,javpi6.jpg",
                category);

        Product product8 = new Product("Pamiętnik czarnego noska",
                "Miś zwany Czarnym Noskiem bardzo nudził się na sklepowej witrynie, marzył, żeby jakieś miłe i grzeczne dziecko zabrało go do domu.",
                "Rząd 4; miejsce 1",
                15,
                "http://webimage.pl/pics/184/6/d9788328046184.jpg",
                category5);
        Product product9 = new Product("Szewczyk dratewka",
                "Znana baśń o szewczyku, który musi wykonać trzy trudne zadania, aby uwolnić pannę zamkniętą na wieży przez złą czarownicę. " +
                        "Pomagają mu w tym zaprzyjaźnione z nim zwierzęta.",
                "Rząd 4; miejsce 2",
                15,
                "http://webimage.pl/pics/864/9/d187777.jpg",
                category5);

        Product product10 = new Product("Inwazja",
                "Współczesna Polska, w której żyją: Roman, były żołnierz wojsk specjalnych i uczestnik wielu zagranicznych misji, " +
                        "Danuta kobieta kochająca luksus, ciężko pracująca i całkowicie uzależniona od ojca tyrana oraz Michał, " +
                        "bezrobotny historyk z żoną i dwójką dzieci.",
                "Rząd 2; miejsce 1",
                0,
                "http://webimage.pl/pics/234/4/d857398.jpg",
                category3);

        Product product11 = new Product("Latarnia umarłych",
                "Akcja \"Latarni umarłych\" rozgrywa się w rok po wydarzeniach opisanych w \"Sedinum\" - wiadomość z podziemi.",
                "Rząd 2; miejsce 1",
                15,
                "http://webimage.pl/pics/234/4/d857398.jpg",
                category3);


        Product product12 = new Product("Java podstawy",
                "Najważniejszy praktyczny poradnik i podręcznik dla doświadczonych programistów dążących do " +
                        "doskonalenia swoich umiejętności w zakresie posługiwania się językiem Java.",
                "Rząd 1; miejsce 1",
                15,
                "https://static01.helion.com.pl/global/okladki/326x466/4dbd7b921aa2dafbf867c4ac097d6998,javp10.jpg",
                category);

        Product product13 = new Product("Java w pigułce",
                "Java to język programowania wybierany wszędzie tam, gdzie są wymagane najwyższe bezpieczeństwo i wydajność.",
                "Rząd 1; miejsce 2",
                150,
                "https://static01.helion.com.pl/global/okladki/326x466/06a3d95a2c11220eb256f2b29d604546,javpi6.jpg",
                category);

        Product product14 = new Product("Pamiętnik czarnego noska",
                "Miś zwany Czarnym Noskiem bardzo nudził się na sklepowej witrynie, marzył, żeby jakieś miłe i grzeczne dziecko zabrało go do domu.",
                "Rząd 4; miejsce 1",
                15,
                "http://webimage.pl/pics/184/6/d9788328046184.jpg",
                category5);
        Product product15 = new Product("Szewczyk dratewka",
                "Znana baśń o szewczyku, który musi wykonać trzy trudne zadania, aby uwolnić pannę zamkniętą na wieży przez złą czarownicę. " +
                        "Pomagają mu w tym zaprzyjaźnione z nim zwierzęta.",
                "Rząd 4; miejsce 2",
                15,
                "http://webimage.pl/pics/864/9/d187777.jpg",
                category5);

        Product product16 = new Product("Inwazja",
                "Współczesna Polska, w której żyją: Roman, były żołnierz wojsk specjalnych i uczestnik wielu zagranicznych misji, " +
                        "Danuta kobieta kochająca luksus, ciężko pracująca i całkowicie uzależniona od ojca tyrana oraz Michał, " +
                        "bezrobotny historyk z żoną i dwójką dzieci.",
                "Rząd 2; miejsce 1",
                0,
                "http://webimage.pl/pics/234/4/d857398.jpg",
                category3);

        Product product17 = new Product("Latarnia umarłych",
                "Akcja \"Latarni umarłych\" rozgrywa się w rok po wydarzeniach opisanych w \"Sedinum\" - wiadomość z podziemi.",
                "Rząd 2; miejsce 1",
                15,
                "http://webimage.pl/pics/234/4/d857398.jpg",
                category3);


        Product product18 = new Product("Java podstawy",
                "Najważniejszy praktyczny poradnik i podręcznik dla doświadczonych programistów dążących do " +
                        "doskonalenia swoich umiejętności w zakresie posługiwania się językiem Java.",
                "Rząd 1; miejsce 1",
                15,
                "https://static01.helion.com.pl/global/okladki/326x466/4dbd7b921aa2dafbf867c4ac097d6998,javp10.jpg",
                category);

        Product product19 = new Product("Java w pigułce",
                "Java to język programowania wybierany wszędzie tam, gdzie są wymagane najwyższe bezpieczeństwo i wydajność.",
                "Rząd 1; miejsce 2",
                150,
                "https://static01.helion.com.pl/global/okladki/326x466/06a3d95a2c11220eb256f2b29d604546,javpi6.jpg",
                category);

        Product product20 = new Product("Pamiętnik czarnego noska",
                "Miś zwany Czarnym Noskiem bardzo nudził się na sklepowej witrynie, marzył, żeby jakieś miłe i grzeczne dziecko zabrało go do domu.",
                "Rząd 4; miejsce 1",
                15,
                "http://webimage.pl/pics/184/6/d9788328046184.jpg",
                category5);
        Product product21 = new Product("Szewczyk dratewka",
                "Znana baśń o szewczyku, który musi wykonać trzy trudne zadania, aby uwolnić pannę zamkniętą na wieży przez złą czarownicę. " +
                        "Pomagają mu w tym zaprzyjaźnione z nim zwierzęta.",
                "Rząd 4; miejsce 2",
                15,
                "http://webimage.pl/pics/864/9/d187777.jpg",
                category5);

        Product product22 = new Product("Inwazja",
                "Współczesna Polska, w której żyją: Roman, były żołnierz wojsk specjalnych i uczestnik wielu zagranicznych misji, " +
                        "Danuta kobieta kochająca luksus, ciężko pracująca i całkowicie uzależniona od ojca tyrana oraz Michał, " +
                        "bezrobotny historyk z żoną i dwójką dzieci.",
                "Rząd 2; miejsce 1",
                0,
                "http://webimage.pl/pics/234/4/d857398.jpg",
                category3);

        Product product23 = new Product("Latarnia umarłych",
                "Akcja \"Latarni umarłych\" rozgrywa się w rok po wydarzeniach opisanych w \"Sedinum\" - wiadomość z podziemi.",
                "Rząd 2; miejsce 1",
                15,
                "http://webimage.pl/pics/234/4/d857398.jpg",
                category3);


        Product product24 = new Product("Java podstawy",
                "Najważniejszy praktyczny poradnik i podręcznik dla doświadczonych programistów dążących do " +
                        "doskonalenia swoich umiejętności w zakresie posługiwania się językiem Java.",
                "Rząd 1; miejsce 1",
                15,
                "https://static01.helion.com.pl/global/okladki/326x466/4dbd7b921aa2dafbf867c4ac097d6998,javp10.jpg",
                category);

        Product product25 = new Product("Java w pigułce",
                "Java to język programowania wybierany wszędzie tam, gdzie są wymagane najwyższe bezpieczeństwo i wydajność.",
                "Rząd 1; miejsce 2",
                150,
                "https://static01.helion.com.pl/global/okladki/326x466/06a3d95a2c11220eb256f2b29d604546,javpi6.jpg",
                category);

        Product product26 = new Product("Pamiętnik czarnego noska",
                "Miś zwany Czarnym Noskiem bardzo nudził się na sklepowej witrynie, marzył, żeby jakieś miłe i grzeczne dziecko zabrało go do domu.",
                "Rząd 4; miejsce 1",
                15,
                "http://webimage.pl/pics/184/6/d9788328046184.jpg",
                category5);
        Product product27 = new Product("Szewczyk dratewka",
                "Znana baśń o szewczyku, który musi wykonać trzy trudne zadania, aby uwolnić pannę zamkniętą na wieży przez złą czarownicę. " +
                        "Pomagają mu w tym zaprzyjaźnione z nim zwierzęta.",
                "Rząd 4; miejsce 2",
                15,
                "http://webimage.pl/pics/864/9/d187777.jpg",
                category5);

        Product product28 = new Product("Inwazja",
                "Współczesna Polska, w której żyją: Roman, były żołnierz wojsk specjalnych i uczestnik wielu zagranicznych misji, " +
                        "Danuta kobieta kochająca luksus, ciężko pracująca i całkowicie uzależniona od ojca tyrana oraz Michał, " +
                        "bezrobotny historyk z żoną i dwójką dzieci.",
                "Rząd 2; miejsce 1",
                0,
                "http://webimage.pl/pics/234/4/d857398.jpg",
                category3);

        Product product29 = new Product("Latarnia umarłych",
                "Akcja \"Latarni umarłych\" rozgrywa się w rok po wydarzeniach opisanych w \"Sedinum\" - wiadomość z podziemi.",
                "Rząd 2; miejsce 1",
                15,
                "http://webimage.pl/pics/234/4/d857398.jpg",
                category3);


        Product product30 = new Product("Java podstawy",
                "Najważniejszy praktyczny poradnik i podręcznik dla doświadczonych programistów dążących do " +
                        "doskonalenia swoich umiejętności w zakresie posługiwania się językiem Java.",
                "Rząd 1; miejsce 1",
                15,
                "https://static01.helion.com.pl/global/okladki/326x466/4dbd7b921aa2dafbf867c4ac097d6998,javp10.jpg",
                category);

        Product product31 = new Product("Java w pigułce",
                "Java to język programowania wybierany wszędzie tam, gdzie są wymagane najwyższe bezpieczeństwo i wydajność.",
                "Rząd 1; miejsce 2",
                150,
                "https://static01.helion.com.pl/global/okladki/326x466/06a3d95a2c11220eb256f2b29d604546,javpi6.jpg",
                category);

        Product product32 = new Product("Pamiętnik czarnego noska",
                "Miś zwany Czarnym Noskiem bardzo nudził się na sklepowej witrynie, marzył, żeby jakieś miłe i grzeczne dziecko zabrało go do domu.",
                "Rząd 4; miejsce 1",
                15,
                "http://webimage.pl/pics/184/6/d9788328046184.jpg",
                category5);
        Product product33 = new Product("Szewczyk dratewka",
                "Znana baśń o szewczyku, który musi wykonać trzy trudne zadania, aby uwolnić pannę zamkniętą na wieży przez złą czarownicę. " +
                        "Pomagają mu w tym zaprzyjaźnione z nim zwierzęta.",
                "Rząd 4; miejsce 2",
                15,
                "http://webimage.pl/pics/864/9/d187777.jpg",
                category5);

        Product product34 = new Product("Inwazja",
                "Współczesna Polska, w której żyją: Roman, były żołnierz wojsk specjalnych i uczestnik wielu zagranicznych misji, " +
                        "Danuta kobieta kochająca luksus, ciężko pracująca i całkowicie uzależniona od ojca tyrana oraz Michał, " +
                        "bezrobotny historyk z żoną i dwójką dzieci.",
                "Rząd 2; miejsce 1",
                0,
                "http://webimage.pl/pics/234/4/d857398.jpg",
                category3);

        Product product35 = new Product("Latarnia umarłych",
                "OSTATNI PRODUKT Akcja \"Latarni umarłych\" rozgrywa się w rok po wydarzeniach opisanych w \"Sedinum\" - wiadomość z podziemi.",
                "Rząd 2; miejsce 1",
                15,
                "http://webimage.pl/pics/234/4/d857398.jpg",
                category3);

        jpaProductRepository.save(product);
        jpaProductRepository.save(product1);
        jpaProductRepository.save(product2);
        jpaProductRepository.save(product3);
        jpaProductRepository.save(product4);
        jpaProductRepository.save(product5);

        jpaProductRepository.save(product6);
        jpaProductRepository.save(product7);
        jpaProductRepository.save(product8);
        jpaProductRepository.save(product9);
        jpaProductRepository.save(product10);
        jpaProductRepository.save(product11);
        jpaProductRepository.save(product12);
        jpaProductRepository.save(product13);
        jpaProductRepository.save(product14);
        jpaProductRepository.save(product15);
        jpaProductRepository.save(product16);
        jpaProductRepository.save(product17);
        jpaProductRepository.save(product18);
        jpaProductRepository.save(product19);
        jpaProductRepository.save(product20);
        jpaProductRepository.save(product21);
        jpaProductRepository.save(product22);
        jpaProductRepository.save(product23);
        jpaProductRepository.save(product24);
        jpaProductRepository.save(product25);
        jpaProductRepository.save(product26);
        jpaProductRepository.save(product27);
        jpaProductRepository.save(product28);
        jpaProductRepository.save(product29);
        jpaProductRepository.save(product30);
        jpaProductRepository.save(product31);
        jpaProductRepository.save(product32);
        jpaProductRepository.save(product33);
        jpaProductRepository.save(product34);
        jpaProductRepository.save(product35);

    }
}
