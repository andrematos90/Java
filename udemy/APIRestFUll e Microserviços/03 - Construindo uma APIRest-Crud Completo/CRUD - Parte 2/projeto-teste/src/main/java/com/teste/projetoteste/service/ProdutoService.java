import com.teste.projetoteste.model.Produto;
import com.teste.projetoteste.repository.ProdutoRepository;

public class ProdutoService {
    @Autowired
    private ProdutoRepository produtoRepository;
    
    public List<Produto> obterTodos(){
        //colocaria a regra de negocio aqui
        return produtoRepository.obterTodos();
    }

    public Optional<Produto> obterPorId(Integer id){
         //colocaria a regra de negocio aqui
        return produtoRepository.obterPorID(id);
    }

    public Produto adicionar(Produto produto){
         //colocaria alguma validação aqui
        return produtoRepository.adicionar(produto);
    }

    public void deletar(Integer id){
        //colocaria alguma validação aqui
        produtoRepository.deletar(id);
    }

    public Produto atualizar(Integer id, Produto produto){
        //colocaria alguma validação aqui
        produto.setId(id);
        return produtoRepository.atualizar(produto);
    }

}
