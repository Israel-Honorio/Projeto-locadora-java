/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author parac
 */

//Cria condições de validação de campos de formulário
public class Verificador {
    
    public boolean isPlaca(String placa){
        if (placa.length()!=7)return false;
        for(int i = 0; i < 7; i++){
            char c = placa.charAt(i);
            boolean isLetter = ('A'<=c && c<='Z');
            boolean isNumerical = ('0'<=c && c<='9');
            if (!(isLetter || isNumerical))return false;
            if (i < 3 && !isLetter)return false;
            if (i > 2 && i != 4 && !isNumerical)return false;
        }
        return true;
    }
    public boolean isMarca(String marca){
        return !marca.equals("");
    }
    public boolean isModelo(String modelo){
        return true;
    }
    public boolean isNome(String nome){
        return !nome.equals("");
    }
    public boolean isCor(String cor){
        return !cor.equals("");
    }
    public boolean isAno(String ano){
        try{
            short a = Short.parseShort(ano);
            return a > 1899 && a < 3000;
        } catch (Exception e){
            return false;
        }
    }
    public boolean isPreco(String preco){
        //TODO
        preco = preco.replace(',','.');
        try{
            double p = Double.parseDouble(preco);
            return p > 0.0;
        } catch(Exception e){
            return false;
        }
    }
    public boolean isCpf(String cpf){
        //TODO
        if (cpf.length()!=11)return false;
        try{
            long l = Long.parseLong(cpf);
            return l >= 0;
        } catch(Exception e){
            return false;
        }
    }
    public boolean isEmail(String email){
        //TODO
        int posArroba = -1;
        for(int i = 0; i < email.length(); i++){
            if (email.charAt(i)=='@'){
                if (posArroba!=-1)return false;
                posArroba = i;
            }
        }
        return posArroba > 0 && posArroba < email.length()-1;
    }
    public boolean isTelefone(String telefone){
        if (telefone.length()<8)return false;
        try{
            long l = Long.parseLong(telefone);
            return l >= 0;
        } catch(Exception e){
            return false;
        }
    }
    public boolean isCep(String cep){
        //TODO
        if (cep.length()!=8)return false;
        try{
            long l = Long.parseLong(cep);
            return l >= 0;
        } catch(Exception e){
            return false;
        }
    }
    public boolean isSenha(String senha){
        return !senha.equals("");
    }
    public boolean isSalario(String salario){
        salario = salario.replace(",",".");
        try{
            double d = Double.parseDouble(salario);
            return d > 0;
        } catch(Exception e){
            return false;
        }
    }
}
