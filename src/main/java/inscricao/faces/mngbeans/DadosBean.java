/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package inscricao.faces.mngbeans;

import inscricao.entity.Candidato;
import java.util.ArrayList;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import utfpr.faces.support.PageBean;

/**
 *
 * @author Wilson
 */
@ManagedBean
@ApplicationScoped
public class DadosBean extends PageBean {
    private ArrayList<Candidato> dados = new ArrayList<>();

    public DadosBean() {
    }

    public ArrayList<Candidato> getDados() {
        return dados;
    }

    public void setDados(ArrayList<Candidato> dados) {
        this.dados = dados;
    }
    
}
