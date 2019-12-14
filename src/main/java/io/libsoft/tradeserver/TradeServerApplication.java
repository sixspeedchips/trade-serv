package io.libsoft.tradeserver;

import io.libsoft.tradeserver.service.populater.TableBuilderKuCoin;
import io.reactivex.disposables.CompositeDisposable;
import javax.annotation.PostConstruct;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TradeServerApplication {


  public static void main(String[] args) {
    SpringApplication.run(TradeServerApplication.class, args);
  }


  @Bean
  public CompositeDisposable getCompositeDisposable(){
    return new CompositeDisposable();
  }

}
