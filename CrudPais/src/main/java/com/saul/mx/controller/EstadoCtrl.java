package com.saul.mx.controller;

import com.saul.mx.dominio.Estado;
import com.saul.mx.servicio.EstadoService;
import com.saul.mx.servicio.PaisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("EstadoCtrl")
@CrossOrigin
public class EstadoCtrl {

    @Autowired
    EstadoService estadoService;

    @Autowired
    PaisService paisService;

    @GetMapping("/")
    public String index(Model model) {
        var lista = estadoService.listar();
        model.addAttribute("lisEstado", lista);
        return "estado/listaEstado";
    }

    @GetMapping("/modificar")
    public String modificar(@RequestParam("id") int idEstado, Model model) {
        Estado estado = estadoService.buscarID(idEstado);
        model.addAttribute("estado", estado);
        model.addAttribute("paisLista", paisService.listar());
        return "estado/formEstado";
    }

    @PostMapping("/guardar")
    public String guardarFruta(Estado estado, BindingResult result, RedirectAttributes atributo, Model model) {
        if (result.hasErrors()) {
            for (ObjectError err : result.getAllErrors()) {
                System.out.println("Error : " + err.getDefaultMessage());
            }
            return "estado/formEstado";
        }
        if (estado.getIdEstado() == 0) {
            Estado aux = estadoService.listar().get(estadoService.listar().size() - 1);
            estado.setIdEstado(aux.getIdEstado() + 1);
        }
        estadoService.guardar(estado);
        atributo.addFlashAttribute("msg", "Se guardo la nueva fruta");
        return "redirect:/EstadoCtrl/";
    }

    @GetMapping("nueva")
    public String nuevaFruta(Estado estado, Model model) {
        model.addAttribute("paisLista", paisService.listar());
        return "estado/formEstado";
    }

    @GetMapping("/eliminar")
    public String eliminarFruta(@RequestParam("id") int idEstado,
                                RedirectAttributes atributo) {
        estadoService.eliminar(idEstado);
        atributo.addFlashAttribute("msg", "Estado eliminada");
        return "redirect:/EstadoCtrl/";
    }
}