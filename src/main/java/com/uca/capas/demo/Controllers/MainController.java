package com.uca.capas.demo.Controllers;

import com.uca.capas.demo.DAO.EstudianteDAO;
import com.uca.capas.demo.Domain.Estudiante;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.List;

@Controller
public class MainController {
    @Autowired
    private EstudianteDAO estudianteDAO;

    //Lista de estudiantes

    @RequestMapping("/listado")
    public ModelAndView initMain(){
        ModelAndView mav = new ModelAndView();
        List<Estudiante> estudiantes = null;
        try{
            estudiantes=estudianteDAO.findAll();
        }catch (Exception e){
            e.printStackTrace();
        }
        mav.addObject("estudiantes",estudiantes);
        mav.setViewName("listado");
        return mav;
    }

    @RequestMapping("/inicio")
    public ModelAndView inicio(){
        ModelAndView mav = new ModelAndView();
        mav.addObject("estudiante",new Estudiante());
        mav.setViewName("index");
        return mav;
    }

    @RequestMapping("/form")
    public ModelAndView findOne(@Valid @ModelAttribute Estudiante estudiante, BindingResult result){
        ModelAndView mav = new ModelAndView();
        if(result.hasErrors()){
            mav.setViewName("index");
        }else{
            try {
                estudianteDAO.insertEstudiante(estudiante);
                Estudiante es= new Estudiante();
                mav.addObject("estudiante", es);
                mav.setViewName("index");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return mav;
    }
    }


