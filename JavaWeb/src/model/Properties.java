package model;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Map;
import java.util.TreeMap;

public class Properties {
	
	private static final String FILE_NAME="C:/Users/fsouviei/OneDrive - everis/Documentos/P2B/cursoServlet/JavaWeb/WebContent/WEB-INF/bd.txt";
	private static java.util.Properties bd; //permite mapear chave e valores
	
	static{
		bd= new java.util.Properties(); //cria o objeto
	try{
		bd.load(new FileInputStream(FILE_NAME));// carrega os valores do caminho passado 
	}catch(IOException e){
		e.printStackTrace();
		}
	}
	//Construtor privado- para evitar que ela seja construida fora de outra classe
	private Properties(){
	}
	//retorna um map de string e valor
	public static Map<String, String> getProperties(){
		
		Map<String,String> map= new TreeMap<String,String>();
		Enumeration<Object> e = bd.keys();
		
		while( e.hasMoreElements()){
		  String key = (String) e.nextElement();
		  String value = bd.getProperty(key);
		  map.put(key, value);
		}
		return map;
	}
	public static void delete (String key) throws IOException{
		bd.remove(key);//remove o dado da memoria
		bd.store(new FileOutputStream(FILE_NAME),"");// gravação dos dados atualizados
	}
    public static void save(String key, String value)throws IOException{
    		bd.setProperty(key, value);//altera em memoria
    		bd.store(new FileOutputStream(FILE_NAME),"");// gravação dos dados atualizados
    }
    //retorna uma valor com base em uma chave
    public static String getValue(String key){
    	return bd.getProperty(key);
    }
}

