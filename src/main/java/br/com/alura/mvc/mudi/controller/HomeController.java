package br.com.alura.mvc.mudi.controller;

import br.com.alura.mvc.mudi.model.Pedido;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class HomeController {

    @GetMapping("/home")
    public String home(Model model){
        Pedido pedido = new Pedido();
        pedido.setNomeProduto("Relógio Inteligente Bluetooth Haiz IP67 44mm My Watch I Fit PRETO HZ-ZL02D");
        pedido.setUrlProduto("https://www.amazon.com.br/Smartwatch-Rel%C3%B3gio-Inteligente-Watch-HZ-ZL02D/dp/B0BWSDKSB2/ref=asc_df_B0BWSDKSB2/?tag=googleshopp00-20&linkCode=df0&hvadid=647511832292&hvpos=&hvnetw=g&hvrand=8508842568422321986&hvpone=&hvptwo=&hvqmt=&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9101596&hvtargid=pla-1968583500168&psc=1&mcid=90d383a348b837b3a55f178199b3b036");
        pedido.setDescricao("RESISTÊNTE À ÁGUA: mergulhe em sua jornada fitness sem se preocupar! Este relógio é resistente à água, permitindo ficar até 1 metro de profundidade. Ideal para natação e uso em qualquer clima.");
        pedido.setUrlImagem("https://m.media-amazon.com/images/I/71s7fVYV1kL._AC_SL1500_.jpg");
        List<Pedido> pedidos = Arrays.asList(pedido);
        model.addAttribute("pedidos", pedidos);
        return "home";
    }
}
