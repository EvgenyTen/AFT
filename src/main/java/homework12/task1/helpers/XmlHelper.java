package homework12.task1.helpers;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import homework12.task1.model.Generatable;


public class XmlHelper implements SerializeHelper {
    @Override
    public Generatable deserialize(String xml, Class classx) {
        XmlMapper xmlMapper=new XmlMapper();
        try{return (Generatable) xmlMapper.readValue(xml,classx);}
        catch (JsonProcessingException e){throw new RuntimeException("NOT WORKING deserialize");}
    }


    @Override
    public String serialize(Generatable object) {
        XmlMapper xmlMapper=new XmlMapper();
        try{return xmlMapper.writeValueAsString(object);}
        catch (JsonProcessingException e){throw new RuntimeException("NOT WORKING serialize");}
    }
}
