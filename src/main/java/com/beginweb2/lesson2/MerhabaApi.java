package com.beginweb2.lesson2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// merhaba classının ewb api'ayi ola bilmesi için;

@RestController
@RequestMapping("/mesaj")// hangi ardesde yayınlanacaksa.
public class MerhabaApi {
    @GetMapping// servere/sunucuya istek göndermek istersek."mesaj" adresine get yapıldığında "merhaba" method çalışsın.
    // çALışırsada "merhaba" methodunun içindeki mesaj geri dönsün
    public String merhaba(){
        return "Selamun Aleyküm" +
                " Mekan Sahetmammedov";


    }
}
