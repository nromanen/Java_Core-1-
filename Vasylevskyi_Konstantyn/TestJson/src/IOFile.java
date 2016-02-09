/**
 * Created by Smart on 07.02.2016.
 */
import java.io.File;
import java.io.IOException;
import java.util.Collection;
import com.fasterxml.jackson.databind.ObjectMapper;

public class IOFile implements IOAuto {
    private static final ObjectMapper mapper = new ObjectMapper();
    private static final ObjectMapper mapperF = new ObjectMapper();
    @Override
    public void writeAuto(String file, Auto auto) throws  IOException {
        switch(file){
            case "CONSOLE":
                mapper.writeValue(System.out, auto);
                break;
            default:
                mapperF.writeValue(new File(file), auto);
        }

    }

    @Override
    public Auto readAuto(String file) throws IOException {
        return  mapper.readValue(new File(file), Auto.class);
    }

    @Override
    public void writeAutos(String file, Collection<Auto> autos)
            throws  IOException {
        switch(file){
            case "CONSOLE":
                mapper.writeValue(System.out,autos);
                break;
            default:
                mapperF.writeValue(new File(file), autos);
        }
    }

    @Override
    public Collection <Auto> readAutos(String file) throws  IOException {


        return  mapper.readValue(new File(file), Collection.class);
    }}