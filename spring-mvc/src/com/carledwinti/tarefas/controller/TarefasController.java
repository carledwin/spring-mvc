package com.carledwinti.tarefas.controller;





import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

import com.carledwinti.tarefas.model.Tarefa;

@Controller
public class TarefasController {

	@RequestMapping("adicionaTarefa")
	public String adiciona(@Valid Tarefa tarefa, BindingResult result){//@Valid avisa o spring mvc que devera validar com o bean validation
		/*validacao local
		 *if(tarefa.getDescricao() == null || tarefa.getDescricao().equals("")){
		 *	return "tarefa/formulario";
		 *}
		 */
		
		/*captura de erros na validacao de bean validation
		 *if(result.hasFiedErros("descricao")){
		 *	return "tarefa/formulario";
		 }
		 */
		if(result.hasErrors()){
			return "tarefa/formulario";
		}
		
		
		
		//JdbcTarefaDao dao = new JdbcTarefaDAO();
		//dao.adiciona(tarefa);
		return "tarefa/adicionada";
	}
	
	@RequestMapping("novaTarefa")
	public String form(){
		return "tarefa/formulario";
	}
}
