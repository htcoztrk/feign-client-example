package com.testinium.east.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value="west",url = "http://localhost:8081/api")
public interface MessageService {
    @GetMapping("/getMessage")
    String getWestMessage();
}


/*
Tuketmek istedigimiz servisi bir java interfaceine map ettik.
Bu mapping'de spring web anotasyonlarini kullanabiliyoruz.
Bu interfacein bir feign client oldugunu anotasyon ile belirttik.
Bu anotasyonun en onemli parametresi: tuketilecek microservicein ismidir.
Bu interfacein icerisindeki methodlari yine bir endpoint gibi kodluyoruz.
Bu interfacein implementasyonunu yazmıyoruz. Sadece @FeignClient anotasyonuna parametre olarak hangi servisi tüketecegimizi belirtmemiz yeterli.
Feign clienti yalnızca icerideki, localdeki serviceler arasında kullanılabilir.

Feign Client'e neden ihtiyac duyarız?
  -Tuketilmek istenen service, consumer-service icersisindeki bir service gibi
  tanımlanır. Bu duurm kullanımı kolaylastirir, kodu daha temiz hale getirir.
  -Tuketmek istedigimiz servisin hangi endpointlerini kullanacagimizi bu kisimdan kolayca takip edebiliriz.
  -Rest Template sinifina ihtiyacimiz kalmaz. Rest Template göre daha pratik.
 */