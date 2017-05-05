package br.com.livraria.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.com.livraria.model.Estado;
import br.com.livraria.model.Produto;
import br.com.livraria.model.Tipo;
import br.com.livraria.repository.Produtos;

@Controller
@RequestMapping("/produtos")
public class LivrariaController {

	@Autowired
	private Produtos produtos;
	
	@RequestMapping("/novo")
	public ModelAndView novo(){
		ModelAndView mv = new ModelAndView("Cadastro");
		mv.addObject("todosEstados", Estado.values());
		mv.addObject("todosTipos", Tipo.values());
		return mv;
	}

	@RequestMapping(method = RequestMethod.POST)
	public ModelAndView salvar(Produto produto){
		produtos.save(produto);
		ModelAndView mv = new ModelAndView("Cadastro");
		mv.addObject("mensagem", "Titulo salvo com sucesso.");
		return mv;
	}
	
	@ModelAttribute("todosEstados")
	public List<Estado> todosEstados(){
		return Arrays.asList(Estado.values());
	}
	
	@ModelAttribute("todosTipos")
	public List<Tipo> todosTipos(){
		return Arrays.asList(Tipo.values());
	}
}
