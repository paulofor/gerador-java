package jet.csdn35.mvc;

import java.util.*;
import gerapp.app.*;
import jet.wrappers.base.*;
import jet.wrappers.cs.*;
import gerapp.modelo.*;

public class Controller
{
  protected static String nl;
  public static synchronized Controller create(String lineSeparator)
  {
    nl = lineSeparator;
    Controller result = new Controller();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "namespace ";
  protected final String TEXT_2 = ".mvc.controller {" + NL + "" + NL + "using System;" + NL + "using System.Web.Mvc;" + NL + "using System.Collections.Generic;" + NL + "using ";
  protected final String TEXT_3 = ".mvc.controller;" + NL + "using ";
  protected final String TEXT_4 = ".servico;" + NL + "using ";
  protected final String TEXT_5 = ".servico.filtro;" + NL + "using ";
  protected final String TEXT_6 = ".modelo;" + NL + "" + NL + "" + NL + "public abstract class ";
  protected final String TEXT_7 = "BaseController : BaseController {" + NL + "" + NL + "" + NL + "\t\tprotected ";
  protected final String TEXT_8 = "Servico servico =" + NL + "            FabricaServico.getInstancia().get";
  protected final String TEXT_9 = "Servico" + NL + "            (FabricaServico.LOCAL);" + NL + "" + NL + "\t\tprotected ";
  protected final String TEXT_10 = "Filtro Filtro " + NL + "\t\t{" + NL + "\t\t\tget { return servico.getFiltro(); }" + NL + "\t\t}" + NL + "\t\t" + NL + "\t\t/*" + NL + "\t\t";
  protected final String TEXT_11 = NL + "\t\t// Utilizado para carregar dados de um outro objeto em uma Pagina Estrutura." + NL + "\t\tpublic ActionResult ObtemPor";
  protected final String TEXT_12 = "(long id) {" + NL + "\t\t\t";
  protected final String TEXT_13 = " item = servico.obtemPor";
  protected final String TEXT_14 = "(id);" + NL + "\t\t\tvar model = item;" + NL + "\t\t\treturn PartialView(\"";
  protected final String TEXT_15 = "Display\", model); " + NL + "\t\t}" + NL + " \t\t";
  protected final String TEXT_16 = NL + "\t\t*/\t\t" + NL + "" + NL + "\t\t/**" + NL + "         * 1- Obtem objeto passado por Id;" + NL + "         * 2- Se id=0 cria novo objeto no banco" + NL + "         * 3- Desvia para view Display" + NL + "\t\t * Obs: sem acesso a camada de servi?o." + NL + "         */" + NL + " \t\tpublic ActionResult Display(long id)" + NL + "        {";
  protected final String TEXT_17 = NL + "            ";
  protected final String TEXT_18 = " item = null;" + NL + "            if (id>0) {" + NL + "            \titem = servico.obtemPorId(id);" + NL + "            } else {" + NL + "              \titem = FabricaVo.cria";
  protected final String TEXT_19 = "();" + NL + "              \tpreencheNovoItem(item);" + NL + "              \tservico.criaLoad(item);" + NL + "            }" + NL + "            var model = item;" + NL + "            return PartialView(\"";
  protected final String TEXT_20 = "Display\", model);" + NL + "        }" + NL + "        " + NL + "        // Utilizado para exibir um objeto que e parte de outro" + NL + "        // sem criar" + NL + "        public ActionResult DisplaySimples(long id)" + NL + "        {";
  protected final String TEXT_21 = NL + "            ";
  protected final String TEXT_22 = " item = null;" + NL + "            if (id>0) {" + NL + "            \titem = servico.obtemPorId(id);" + NL + "            } " + NL + "            var model = item;" + NL + "            return PartialView(\"";
  protected final String TEXT_23 = "Display\", model);" + NL + "        }" + NL + "        /**" + NL + "         * 1- Obtem objeto passado por Id;" + NL + "         * (nao tem) 2- Se id=0 cria novo objeto no banco" + NL + "         * 3- Desvia para view DisplayPage" + NL + "\t\t * Obs: sem acesso a camada de servi?o." + NL + "         */" + NL + " \t\tpublic ActionResult DisplayPage(long id)" + NL + "        {" + NL + "        \tViewData[\"DiretorioVirtual\"] = DiretorioVirtual;";
  protected final String TEXT_24 = NL + "            ";
  protected final String TEXT_25 = "  item = obtemObjetoDisplay(id);" + NL + "            var model = item;" + NL + "            return View(\"";
  protected final String TEXT_26 = "DisplayPage\", model);" + NL + "        }" + NL + "        protected virtual ";
  protected final String TEXT_27 = " obtemObjetoDisplay(long id) " + NL + "        {" + NL + "            return servico.obtemPorId(id);" + NL + "        }" + NL + "        " + NL + "        public ActionResult ExcluiRetornaListaCompleta(long id)" + NL + "        {" + NL + "        \tlong idObjeto = Convert.ToInt32(id);" + NL + "        \tservico.excluiPorId(idObjeto);" + NL + "        \treturn ListaCompleta();" + NL + "        }" + NL + "        " + NL + "        // Chamando um DialogBox para editar." + NL + "        public ActionResult Edita(long id)" + NL + "        {";
  protected final String TEXT_28 = NL + "            ";
  protected final String TEXT_29 = " item = servico.obtemPorId(id);";
  protected final String TEXT_30 = NL + "\t\t\tViewData[\"";
  protected final String TEXT_31 = "\"] = item.";
  protected final String TEXT_32 = ";" + NL + "\t\t\t";
  protected final String TEXT_33 = NL + "\t\t\tViewData[\"IdCorrente\"] = id;" + NL + "\t\t\tPreTelaEdita(item);" + NL + "            var model = item;" + NL + "            return PartialView(\"";
  protected final String TEXT_34 = "Edita\", model);" + NL + "        }" + NL + "        protected virtual void PreTelaEdita(";
  protected final String TEXT_35 = " item) {" + NL + "        }" + NL + "        " + NL + "        " + NL + "        ";
  protected final String TEXT_36 = NL + "       \t/**" + NL + "         * 1- Cria novo objeto;" + NL + "         * 2- Chama preencheNovoItem(item)" + NL + "         * 3- Desvia para view Edita" + NL + "\t\t * Obs: sem acesso a camada de servi?o." + NL + "\t     * Para a montagem do DialogBox" + NL + "         */" + NL + "         // Montagem do DialogBox para uma cria??o. " + NL + "         // Para edicao receber o ID e usar metodo Edita" + NL + "         // " + NL + "         // Candidato para passar a camada de servico," + NL + "         // e ficar no core da aplica??o definindo um padrao " + NL + "         // para objetos novos que j? sao montados com valores iniciais" + NL + "         // independente da camada de aplica??o." + NL + "         // o unico problema ? que nao se encaixa nem num remote nem " + NL + "         // em um local - 09/05/2012 -> Decidir at? 09/08/2012" + NL + "        public ActionResult Novo(";
  protected final String TEXT_37 = ")" + NL + "        //public ActionResult Novo()" + NL + "        {";
  protected final String TEXT_38 = NL + "            ";
  protected final String TEXT_39 = " item = FabricaVo.cria";
  protected final String TEXT_40 = "();";
  protected final String TEXT_41 = NL + "\t\t\titem.";
  protected final String TEXT_42 = " = Convert.ToInt32(";
  protected final String TEXT_43 = "!=null?";
  protected final String TEXT_44 = ":0);";
  protected final String TEXT_45 = NL + "\t\t\tViewData[\"IdCorrente\"] = 0;" + NL + "            preencheNovoItem(item);" + NL + "            var model = item;" + NL + "            return PartialView(\"";
  protected final String TEXT_46 = "Edita\", model);" + NL + "        }" + NL + "        public ActionResult ListaCorrente(";
  protected final String TEXT_47 = ") {" + NL + "         \t";
  protected final String TEXT_48 = " item = FabricaVo.cria";
  protected final String TEXT_49 = "();";
  protected final String TEXT_50 = NL + "\t\t\titem.";
  protected final String TEXT_51 = " = Convert.ToInt32(";
  protected final String TEXT_52 = "!=null?";
  protected final String TEXT_53 = ":0);";
  protected final String TEXT_54 = NL + "\t\t\tmontaFiltroChaves(item);" + NL + "\t\t\tvar model = servico.listaFiltroChaves();" + NL + "        \treturn PartialView(\"";
  protected final String TEXT_55 = "Lista\", model);" + NL + "        }" + NL + "        " + NL + "        // Para ser usado quando vai se criar um objeto, exibindo lista." + NL + "        // Apartir de um outro ja existente" + NL + "        /*" + NL + "        public ActionResult EstruturaDependente(";
  protected final String TEXT_56 = ") {" + NL + "        \t";
  protected final String TEXT_57 = NL + "\t\t\tViewData[\"";
  protected final String TEXT_58 = "\"] = Convert.ToInt32(";
  protected final String TEXT_59 = "!=null?";
  protected final String TEXT_60 = ":0);";
  protected final String TEXT_61 = NL + "\t\t\tpreViewEstrutura();" + NL + "           \treturn View(\"";
  protected final String TEXT_62 = "Estrutura\");" + NL + "        }" + NL + "\t\t*/" + NL + "        " + NL + "        " + NL + "        private ";
  protected final String TEXT_63 = " criaNovoComChaves(FormCollection collection) {" + NL + "        \t";
  protected final String TEXT_64 = " item = FabricaVo.cria";
  protected final String TEXT_65 = "();";
  protected final String TEXT_66 = NL + "\t\t\titem.";
  protected final String TEXT_67 = " = (collection[\"";
  protected final String TEXT_68 = "\"]!=null?Convert.ToInt32(collection[\"";
  protected final String TEXT_69 = "\"]):0);" + NL + "\t\t\t";
  protected final String TEXT_70 = NL + "\t\t\titem.";
  protected final String TEXT_71 = " = (collection[\"";
  protected final String TEXT_72 = "\"]!=null?Convert.ToInt32(collection[\"";
  protected final String TEXT_73 = "\"]):0);" + NL + "\t\t\treturn item;" + NL + "        }" + NL + "        " + NL + "        protected void montaFiltroChaves(";
  protected final String TEXT_74 = " item) {";
  protected final String TEXT_75 = NL + "\t\t\tservico.getFiltro().Codigo";
  protected final String TEXT_76 = "_";
  protected final String TEXT_77 = " = item.";
  protected final String TEXT_78 = ";" + NL + "\t\t\t";
  protected final String TEXT_79 = NL + "        }" + NL + "        " + NL + "        ";
  protected final String TEXT_80 = NL + "        /*" + NL + "        public ActionResult Novo()" + NL + "        {";
  protected final String TEXT_81 = NL + "            ";
  protected final String TEXT_82 = " item = FabricaVo.cria";
  protected final String TEXT_83 = "();" + NL + "\t\t\tViewData[\"IdCorrente\"] = 0;" + NL + "            preencheNovoItem(item);" + NL + "            var model = item;" + NL + "            return PartialView(\"";
  protected final String TEXT_84 = "Edita\", model);" + NL + "        }" + NL + "\t\t*/";
  protected final String TEXT_85 = NL + "        " + NL + "        " + NL + "        " + NL + "         /**" + NL + "         * 1- Chama listaFiltroChaves ( precisa montar Filtro )" + NL + "         * 2- Retorna view Lista" + NL + "         */" + NL + "        protected ActionResult ListaCorrenteFiltro() " + NL + "        {" + NL + "        \tvar model = servico.listaFiltroChaves();" + NL + "        \t//preViewLista();" + NL + "\t\t\treturn PartialView(\"";
  protected final String TEXT_86 = "Lista\", model);" + NL + "        }" + NL + "        " + NL + "        " + NL + "        /*" + NL + "\t\tNao funciona com QueryString" + NL + "        public ActionResult ListaCorrente(FormCollection collection) " + NL + "        {";
  protected final String TEXT_87 = NL + "\t\t\tservico.getFiltro().Codigo";
  protected final String TEXT_88 = "_";
  protected final String TEXT_89 = " = Convert.ToInt32(collection[\"Id";
  protected final String TEXT_90 = "\"]);" + NL + " \t\t";
  protected final String TEXT_91 = "\t" + NL + "\t\t\tvar model = servico.listaFiltroChaves();" + NL + "\t\t\treturn PartialView(\"";
  protected final String TEXT_92 = "Lista\", model);" + NL + "        }" + NL + "\t\t*/        " + NL + "" + NL + "        /**" + NL + "         * 1- Obtem objeto por ID" + NL + "         * 2- Chama preencheItemEdicao(item,form)" + NL + "         * 3- Atualiza na base de dados " + NL + "\t\t * 4- Chama M?todo Display" + NL + "         */" + NL + "        public ActionResult AtualizaDisplay(int id, FormCollection collection)" + NL + "        {" + NL + "        \tViewData[\"DiretorioVirtual\"] = DiretorioVirtual;";
  protected final String TEXT_93 = NL + "            ";
  protected final String TEXT_94 = " item = servico.obtemPorId(id);" + NL + "            preencheItemEdicao(item,collection);" + NL + "            servico.atualiza(item);" + NL + "            return Display(id);" + NL + "        }" + NL + "        " + NL + "         /**" + NL + "         * 1- Obtem objeto por ID" + NL + "         * 2- Chama preencheItemEdicao(item,form)" + NL + "         * 3- Atualiza na base de dados " + NL + "\t\t * 4- Chama M?todo ListaCorrente" + NL + "         */" + NL + "        /* " + NL + "\t\tDepende do ListaCorrente que esta desativado" + NL + "        public ActionResult AtualizaLista(int id, FormCollection collection)" + NL + "        {";
  protected final String TEXT_95 = NL + "            ";
  protected final String TEXT_96 = " item = servico.obtemPorId(id);" + NL + "            preencheItemEdicao(item,collection);" + NL + "            servico.atualiza(item);" + NL + "            return ListaCorrente(collection);" + NL + "        }" + NL + "        */" + NL + "        public ActionResult CriaEditaRetornaLista(FormCollection collection)" + NL + "        {" + NL + "        \tViewData[\"DiretorioVirtual\"] = DiretorioVirtual;";
  protected final String TEXT_97 = NL + "            ";
  protected final String TEXT_98 = " item = criaNovoComChaves(collection); // cria mais do que precisa no caso de edicao" + NL + "            if (item.";
  protected final String TEXT_99 = " != 0)" + NL + "                item = servico.obtemPorId(item.";
  protected final String TEXT_100 = ");" + NL + "            preencheItemEdicao(item, collection);" + NL + "            if (item.";
  protected final String TEXT_101 = "==0) {" + NL + "            \tmontaFiltroChaves(item); // utilizando somente para criacao - recuperacao da tela de edicao" + NL + "\t            servico.criaLoad(item);" + NL + "\t        } else {" + NL + "\t        \tservico.atualiza(item);" + NL + "            }" + NL + "            var lista = RetornaLista(servico.getFiltro(),item, collection);" + NL + "            return PartialView(\"";
  protected final String TEXT_102 = "Lista\", lista);" + NL + "        }" + NL + "        // Permite alterar o metodo de retorno para exibi??o de lista e nao usar listaFiltroChave" + NL + "        protected virtual List<";
  protected final String TEXT_103 = "> RetornaLista(";
  protected final String TEXT_104 = "Filtro filtro, ";
  protected final String TEXT_105 = " item, FormCollection collection )" + NL + "        {" + NL + "            montaFiltroListaRetorno(filtro, item);" + NL + "            return servico.listaFiltroChaves();" + NL + "        }" + NL + "        " + NL + "        public ActionResult CriaNovoRetornaLista(FormCollection collection)" + NL + "        {" + NL + "        \tViewData[\"DiretorioVirtual\"] = DiretorioVirtual;";
  protected final String TEXT_106 = NL + "            ";
  protected final String TEXT_107 = " item = criaNovoComChaves(collection);" + NL + "            preencheItemEdicao(item, collection);" + NL + "            servico.criaLoad(item);" + NL + "            montaFiltroChaves(item);" + NL + "            var lista = RetornaLista(servico.getFiltro(),item, collection);" + NL + "            return PartialView(\"";
  protected final String TEXT_108 = "Lista\", lista);" + NL + "        }" + NL + "        " + NL + "        // Permite montar o filtro para lista de retorno em caso de poder usar listaFiltroChave" + NL + "        protected abstract void montaFiltroListaRetorno(";
  protected final String TEXT_109 = "Filtro filtro, ";
  protected final String TEXT_110 = " item);" + NL + " " + NL + "        " + NL + "        protected virtual void preencheItemEdicao(";
  protected final String TEXT_111 = " item,FormCollection collection) {" + NL + "        \t";
  protected final String TEXT_112 = NL + "\t        \titem.";
  protected final String TEXT_113 = " = ";
  protected final String TEXT_114 = ";" + NL + "\t        ";
  protected final String TEXT_115 = NL + "        }" + NL + "        /**" + NL + "         * 1- Chama view de Estrutura" + NL + "         */" + NL + "        public ActionResult Estrutura(int? id)" + NL + "        {" + NL + "        \tViewData[\"DiretorioVirtual\"] = DiretorioVirtual;" + NL + "        \tViewData[\"Id";
  protected final String TEXT_116 = "\"] = (id!=null?id:0);" + NL + "        \tpreViewEstrutura();" + NL + "           \treturn View(\"";
  protected final String TEXT_117 = "Estrutura\");" + NL + "        }" + NL + "        protected virtual void preViewEstrutura() {" + NL + "        }" + NL + "        " + NL + "        protected abstract void preencheNovoItem(";
  protected final String TEXT_118 = " item);" + NL + "        " + NL + "            " + NL + "        public virtual ActionResult ListaCompleta()" + NL + "        {" + NL + "        \tViewData[\"DiretorioVirtual\"] = DiretorioVirtual;" + NL + "            var model = servico.listaTotal();" + NL + "            return View(\"ListaCompleta\",model);" + NL + "        }" + NL + "        ";
  protected final String TEXT_119 = NL + NL + "\t\t";
  protected final String TEXT_120 = NL + "\t\t// Para fazer atualizacoes em objetos associativos." + NL + "\t\t// **** Usar para fazer atualiza??o de relacionamentos NxN usando uma unica tela." + NL + "\t\t// Exemplo: Experimento/Periodo" + NL + "\t\tpublic ActionResult AtualizaPor";
  protected final String TEXT_121 = "NN(int id, FormCollection collection) {" + NL + "\t\t\tstring[] ids = collection[\"";
  protected final String TEXT_122 = "\"].ToString().Split(',');" + NL + "            long idItem = Convert.ToInt32(id);" + NL + "            servico.AtualizaPor";
  protected final String TEXT_123 = "NN(idItem,ids);" + NL + "            return ListaPor";
  protected final String TEXT_124 = "(id);" + NL + "\t\t}" + NL + "\t\t";
  protected final String TEXT_125 = NL + NL + "\t\tprotected ActionResult AtualizaListaPor";
  protected final String TEXT_126 = "(int id, FormCollection collection) {" + NL + "\t\t\t";
  protected final String TEXT_127 = " item = servico.obtemPorId(id);" + NL + "            preencheItemEdicao(item,collection);" + NL + "            servico.atualiza(item);" + NL + "\t\t\tvar model = servico.getPor";
  protected final String TEXT_128 = "(item.";
  protected final String TEXT_129 = ");" + NL + "            return PartialView(\"";
  protected final String TEXT_130 = "Lista\", model);" + NL + "\t\t}" + NL + "" + NL + "\t\t" + NL + "\t\t" + NL + "\t\t" + NL + "\t\t// Usada nas telas." + NL + "\t\tpublic ActionResult ListaPor";
  protected final String TEXT_131 = "(int id) {" + NL + "\t\t\tViewData[\"DiretorioVirtual\"] = DiretorioVirtual;" + NL + "\t\t\tvar model = servico.getPor";
  protected final String TEXT_132 = "(id);" + NL + "\t\t\tViewData[\"Matriz\"] = ObtemMatriz";
  protected final String TEXT_133 = "(id);" + NL + "            return PartialView(\"";
  protected final String TEXT_134 = "Lista\", model);" + NL + "\t\t}" + NL + "\t\tpublic ActionResult ListaPagePor";
  protected final String TEXT_135 = "(int id) {" + NL + "\t\t\tViewData[\"DiretorioVirtual\"] = DiretorioVirtual;" + NL + "\t\t\tvar model = servico.getPor";
  protected final String TEXT_136 = "(id);" + NL + "\t        ViewData[\"Matriz\"] = ObtemMatriz";
  protected final String TEXT_137 = "(id);" + NL + "            return View(\"";
  protected final String TEXT_138 = "Lista\", model);" + NL + "\t\t}" + NL + "\t\t// Se for utilizar marcar o relacionamento como dependente para" + NL + "\t\t// melhor aproveitar os arquivos de View" + NL + "\t\tpublic ActionResult EstruturaPor";
  protected final String TEXT_139 = "(int id) {" + NL + "\t\t\tViewData[\"DiretorioVirtual\"] = DiretorioVirtual;" + NL + "\t\t\tvar model = servico.getPor";
  protected final String TEXT_140 = "(id);" + NL + "\t\t\tViewData[\"Matriz\"] = ObtemMatriz";
  protected final String TEXT_141 = "(id);" + NL + "\t\t\t//preViewEstrutura();" + NL + "            return View(\"";
  protected final String TEXT_142 = "Estrutura\", model);" + NL + "\t\t}" + NL + "\t\tprotected virtual ";
  protected final String TEXT_143 = " ObtemMatriz";
  protected final String TEXT_144 = "(int id) {" + NL + "\t\t\t";
  protected final String TEXT_145 = "Servico servicoAux = FabricaServico.getInstancia().get";
  protected final String TEXT_146 = "Servico(FabricaServico.LOCAL);";
  protected final String TEXT_147 = NL + "            ";
  protected final String TEXT_148 = " item = servicoAux.obtemPorId(id);" + NL + "            return item;" + NL + "\t\t}" + NL + "\t\tprotected ActionResult CriaPor";
  protected final String TEXT_149 = "(int id) {" + NL + "\t\t\tViewData[\"DiretorioVirtual\"] = DiretorioVirtual;" + NL + "\t\t\t";
  protected final String TEXT_150 = " item = FabricaVo.cria";
  protected final String TEXT_151 = "();" + NL + "            item.";
  protected final String TEXT_152 = " = id;" + NL + "            preencheNovoItem(item);" + NL + "            servico.criaLoad(item);" + NL + "            var model = item;" + NL + "            return PartialView(\"";
  protected final String TEXT_153 = "Edita\", model);" + NL + "\t\t}" + NL + "\t\tprotected ActionResult CriaNovoRetornaListaPor";
  protected final String TEXT_154 = "(int id) {" + NL + "\t\t\tViewData[\"DiretorioVirtual\"] = DiretorioVirtual;" + NL + "\t\t\t";
  protected final String TEXT_155 = " item = FabricaVo.cria";
  protected final String TEXT_156 = "();" + NL + "            item.";
  protected final String TEXT_157 = " = id;" + NL + "            preencheNovoItem(item);" + NL + "            servico.criaLoad(item);" + NL + "            var model = item;" + NL + "            return PartialView(\"";
  protected final String TEXT_158 = "Edita\", model);" + NL + "\t\t}" + NL + "\t\t";
  protected final String TEXT_159 = NL + "\t\t" + NL + "\t\t" + NL + "\t\t" + NL + "\t\t";
  protected final String TEXT_160 = NL + "\tpublic ActionResult EditaAssociacao";
  protected final String TEXT_161 = "(int id)" + NL + "    {" + NL + "    \tlong idLg = Convert.ToInt32(id);" + NL + "        List<";
  protected final String TEXT_162 = "> listaAssociada = servico.getPor";
  protected final String TEXT_163 = "(id);" + NL + "        List<";
  protected final String TEXT_164 = "> listaComplementar = servico.lista";
  protected final String TEXT_165 = "NaoAssociada_";
  protected final String TEXT_166 = "(id);" + NL + "        ViewData[\"";
  protected final String TEXT_167 = "\"] = new SelectList(listaAssociada, \"IdPeriodoExperimentoA\", \"";
  protected final String TEXT_168 = "_";
  protected final String TEXT_169 = ".";
  protected final String TEXT_170 = "\");" + NL + "        ViewData[\"";
  protected final String TEXT_171 = "\"] = new SelectList(listaComplementar, \"";
  protected final String TEXT_172 = "\", \"";
  protected final String TEXT_173 = "\");" + NL + "        return PartialView(\"";
  protected final String TEXT_174 = "Associacao\");" + NL + "    }" + NL + "    " + NL + "    public ActionResult EditaAssociacao";
  protected final String TEXT_175 = "(int id)" + NL + "    {" + NL + "    \tlong idLg = Convert.ToInt32(id);" + NL + "        List<";
  protected final String TEXT_176 = "> listaAssociada = servico.getPor";
  protected final String TEXT_177 = "(id);" + NL + "        List<";
  protected final String TEXT_178 = "> listaComplementar = servico.lista";
  protected final String TEXT_179 = "NaoAssociada_";
  protected final String TEXT_180 = "(id);" + NL + "        ViewData[\"";
  protected final String TEXT_181 = "\"] = new SelectList(listaAssociada, \"IdPeriodoExperimentoA\", \"";
  protected final String TEXT_182 = "_";
  protected final String TEXT_183 = ".";
  protected final String TEXT_184 = "\");" + NL + "        ViewData[\"";
  protected final String TEXT_185 = "\"] = new SelectList(listaComplementar, \"";
  protected final String TEXT_186 = "\", \"";
  protected final String TEXT_187 = "\");" + NL + "        return PartialView(\"";
  protected final String TEXT_188 = "Associacao\");" + NL + "    }";
  protected final String TEXT_189 = NL + "\t\t" + NL + "\t\t" + NL + "\t}" + NL + "" + NL + "" + NL + "}" + NL;
  protected final String TEXT_190 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    
Recursos recursos = (Recursos) argument;  
ClasseWrapper classe = recursos.getClasse();
Configuracao conf = recursos.getConfiguracao();

    stringBuffer.append(TEXT_1);
    stringBuffer.append( conf.getNamespace() );
    stringBuffer.append(TEXT_2);
    stringBuffer.append( conf.getNamespace() );
    stringBuffer.append(TEXT_3);
    stringBuffer.append( conf.getNamespace() );
    stringBuffer.append(TEXT_4);
    stringBuffer.append( conf.getNamespace() );
    stringBuffer.append(TEXT_5);
    stringBuffer.append( conf.getNamespace() );
    stringBuffer.append(TEXT_6);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_7);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_8);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_9);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_10);
    
		Iterator<RelacionamentoWrapper> iterador4 = classe.obtemListaSemChaveEstrangeira().iterator();
		while (iterador4.hasNext()) {
		RelacionamentoWrapper relac = iterador4.next();
		ClasseWrapper classeOposta = relac.getClasseOposta();
		AtributoWrapper chaveOposta = classeOposta.getChaveW();
		
    stringBuffer.append(TEXT_11);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_12);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_13);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_14);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_15);
    
			}
		
    stringBuffer.append(TEXT_16);
    stringBuffer.append(TEXT_17);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_18);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_19);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_20);
    stringBuffer.append(TEXT_21);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_22);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_23);
    stringBuffer.append(TEXT_24);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_25);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_26);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_27);
    stringBuffer.append(TEXT_28);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_29);
    
			Iterator<RelacionamentoWrapper> itRel3 = classe.obtemListaComChaveEstrangeira().iterator();
			while (itRel3.hasNext()) {
			RelacionamentoWrapper relac = itRel3.next();
			ClasseWrapper classeOposta = relac.getClasseOposta();
			
    stringBuffer.append(TEXT_30);
    stringBuffer.append( classeOposta.getChaveW().getNomePropriedade() );
    stringBuffer.append( relac.getIniciais() );
    stringBuffer.append(TEXT_31);
    stringBuffer.append( classeOposta.getChaveW().getNomePropriedade() );
    stringBuffer.append( relac.getIniciais() );
    stringBuffer.append(TEXT_32);
    
			}
			
    stringBuffer.append(TEXT_33);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_34);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_35);
    
		String parametros = "";
		Iterator<RelacionamentoWrapper> itRel1 = classe.obtemListaComChaveEstrangeira().iterator();
		while (itRel1.hasNext()) {
		RelacionamentoWrapper relac = itRel1.next();
		ClasseWrapper classeOposta = relac.getClasseOposta();
		if (parametros.length()>0) parametros += " , ";
		parametros += "int? " + relac.getNomePropriedade();
		}
		
    stringBuffer.append(TEXT_36);
    stringBuffer.append( parametros );
    stringBuffer.append(TEXT_37);
    stringBuffer.append(TEXT_38);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_39);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_40);
    
			Iterator<RelacionamentoWrapper> itRel2 = classe.obtemListaComChaveEstrangeira().iterator();
			while (itRel2.hasNext()) {
			RelacionamentoWrapper relac = itRel2.next();
			ClasseWrapper classeOposta = relac.getClasseOposta();
			
    stringBuffer.append(TEXT_41);
    stringBuffer.append( relac.getNomePropriedade() );
    stringBuffer.append(TEXT_42);
    stringBuffer.append( relac.getNomePropriedade() );
    stringBuffer.append(TEXT_43);
    stringBuffer.append( relac.getNomePropriedade() );
    stringBuffer.append(TEXT_44);
    
			}
			
    stringBuffer.append(TEXT_45);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_46);
    stringBuffer.append( parametros );
    stringBuffer.append(TEXT_47);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_48);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_49);
    
			Iterator<RelacionamentoWrapper> itRel6 = classe.obtemListaComChaveEstrangeira().iterator();
			while (itRel6.hasNext()) {
			RelacionamentoWrapper relac = itRel6.next();
			ClasseWrapper classeOposta = relac.getClasseOposta();
			
    stringBuffer.append(TEXT_50);
    stringBuffer.append( relac.getNomePropriedade() );
    stringBuffer.append(TEXT_51);
    stringBuffer.append( relac.getNomePropriedade() );
    stringBuffer.append(TEXT_52);
    stringBuffer.append( relac.getNomePropriedade() );
    stringBuffer.append(TEXT_53);
    
			}
			
    stringBuffer.append(TEXT_54);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_55);
    stringBuffer.append( parametros );
    stringBuffer.append(TEXT_56);
    
			Iterator<RelacionamentoWrapper> itRel7 = classe.obtemListaComChaveEstrangeira().iterator();
			while (itRel7.hasNext()) {
			RelacionamentoWrapper relac = itRel7.next();
			ClasseWrapper classeOposta = relac.getClasseOposta();
			
    stringBuffer.append(TEXT_57);
    stringBuffer.append( relac.getNomePropriedade() );
    stringBuffer.append(TEXT_58);
    stringBuffer.append( relac.getNomePropriedade() );
    stringBuffer.append(TEXT_59);
    stringBuffer.append( relac.getNomePropriedade() );
    stringBuffer.append(TEXT_60);
    
			}
			
    stringBuffer.append(TEXT_61);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_62);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_63);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_64);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_65);
    
			Iterator<RelacionamentoWrapper> itRel4 = classe.obtemListaComChaveEstrangeira().iterator();
			while (itRel4.hasNext()) {
			RelacionamentoWrapper relac = itRel4.next();
			ClasseWrapper classeOposta = relac.getClasseOposta();
			
    stringBuffer.append(TEXT_66);
    stringBuffer.append( relac.getNomePropriedade() );
    stringBuffer.append(TEXT_67);
    stringBuffer.append( relac.getNomePropriedade() );
    stringBuffer.append(TEXT_68);
    stringBuffer.append( relac.getNomePropriedade() );
    stringBuffer.append(TEXT_69);
    
			}
			
    stringBuffer.append(TEXT_70);
    stringBuffer.append( classe.getChaveW().getNomePropriedade() );
    stringBuffer.append(TEXT_71);
    stringBuffer.append( classe.getChaveW().getNomePropriedade() );
    stringBuffer.append(TEXT_72);
    stringBuffer.append( classe.getChaveW().getNomePropriedade() );
    stringBuffer.append(TEXT_73);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_74);
    
			Iterator<RelacionamentoWrapper> itRel5 = classe.obtemListaComChaveEstrangeira().iterator();
			while (itRel5.hasNext()) {
			RelacionamentoWrapper relac = itRel5.next();
			ClasseWrapper classeOposta = relac.getClasseOposta();
			
    stringBuffer.append(TEXT_75);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_76);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_77);
    stringBuffer.append( relac.getNomePropriedade() );
    stringBuffer.append(TEXT_78);
    
			}
			
    stringBuffer.append(TEXT_79);
     if (parametros.length()>0) { 
    stringBuffer.append(TEXT_80);
    stringBuffer.append(TEXT_81);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_82);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_83);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_84);
     } 
    stringBuffer.append(TEXT_85);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_86);
    
		Iterator<RelacionamentoWrapper> itRel = classe.obtemListaComChaveEstrangeira().iterator();
		while (itRel.hasNext()) {
		RelacionamentoWrapper relac = itRel.next();
		ClasseWrapper classeOposta = relac.getClasseOposta();
		
    stringBuffer.append(TEXT_87);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_88);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_89);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_90);
    
		}
		
    stringBuffer.append(TEXT_91);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_92);
    stringBuffer.append(TEXT_93);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_94);
    stringBuffer.append(TEXT_95);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_96);
    stringBuffer.append(TEXT_97);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_98);
    stringBuffer.append( classe.getChaveW().getNomePropriedade() );
    stringBuffer.append(TEXT_99);
    stringBuffer.append( classe.getChaveW().getNomePropriedade() );
    stringBuffer.append(TEXT_100);
    stringBuffer.append( classe.getChaveW().getNomePropriedade() );
    stringBuffer.append(TEXT_101);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_102);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_103);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_104);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_105);
    stringBuffer.append(TEXT_106);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_107);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_108);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_109);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_110);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_111);
    
        	Iterator<AtributoWrapper> it2 = classe.getListaCamposEdicao().iterator();
        	String campoTela = "";
        	while (it2.hasNext()) {
        		AtributoWrapper corrente = it2.next();
        		campoTela = "collection[\"" + corrente.getNomePropriedade() + "\"]";
        		if (corrente.ehDecimal()) campoTela = "(float) Convert.ToDecimal(collection[\"" + corrente.getNomePropriedade() + "\"])";
        		if (corrente.ehLogico()) campoTela = "(collection[\"" + corrente.getNomePropriedade() + "\"]==\"S\")";
        		if (corrente.ehInteiro()) campoTela =  " Convert.ToInt32(collection[\"" + corrente.getNomePropriedade() + "\"])"; 
        	
    stringBuffer.append(TEXT_112);
    stringBuffer.append( corrente.getNomePropriedade() );
    stringBuffer.append(TEXT_113);
    stringBuffer.append( campoTela );
    stringBuffer.append(TEXT_114);
    
        	}
        	
    stringBuffer.append(TEXT_115);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_116);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_117);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_118);
    
		Iterator<RelacionamentoWrapper> iterador = classe.obtemListaComChaveEstrangeira().iterator();
		while (iterador.hasNext()) {
			RelacionamentoWrapper relCorrente = iterador.next();
		
    stringBuffer.append(TEXT_119);
     if (classe.isAssociativa()) { 
    stringBuffer.append(TEXT_120);
    stringBuffer.append( relCorrente.getNome() );
    stringBuffer.append(TEXT_121);
    stringBuffer.append( classe.getChaveW().getNomePropriedade() );
    stringBuffer.append(TEXT_122);
    stringBuffer.append( relCorrente.getNome() );
    stringBuffer.append(TEXT_123);
    stringBuffer.append( relCorrente.getNome() );
    stringBuffer.append(TEXT_124);
     } 
    stringBuffer.append(TEXT_125);
    stringBuffer.append( relCorrente.getNome() );
    stringBuffer.append(TEXT_126);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_127);
    stringBuffer.append( relCorrente.getNome() );
    stringBuffer.append(TEXT_128);
    stringBuffer.append( relCorrente.getNomePropriedade() );
    stringBuffer.append(TEXT_129);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_130);
    stringBuffer.append( relCorrente.getNome() );
    stringBuffer.append(TEXT_131);
    stringBuffer.append( relCorrente.getNome() );
    stringBuffer.append(TEXT_132);
    stringBuffer.append( relCorrente.getNome() );
    stringBuffer.append(TEXT_133);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_134);
    stringBuffer.append( relCorrente.getNome() );
    stringBuffer.append(TEXT_135);
    stringBuffer.append( relCorrente.getNome() );
    stringBuffer.append(TEXT_136);
    stringBuffer.append( relCorrente.getNome() );
    stringBuffer.append(TEXT_137);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_138);
    stringBuffer.append( relCorrente.getNome() );
    stringBuffer.append(TEXT_139);
    stringBuffer.append( relCorrente.getNome() );
    stringBuffer.append(TEXT_140);
    stringBuffer.append( relCorrente.getNome() );
    stringBuffer.append(TEXT_141);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_142);
    stringBuffer.append( relCorrente.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append(TEXT_143);
    stringBuffer.append( relCorrente.getNome() );
    stringBuffer.append(TEXT_144);
    stringBuffer.append( relCorrente.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append(TEXT_145);
    stringBuffer.append( relCorrente.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append(TEXT_146);
    stringBuffer.append(TEXT_147);
    stringBuffer.append( relCorrente.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append(TEXT_148);
    stringBuffer.append( relCorrente.getNome() );
    stringBuffer.append(TEXT_149);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_150);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_151);
    stringBuffer.append( relCorrente.getNomePropriedade() );
    stringBuffer.append(TEXT_152);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_153);
    stringBuffer.append( relCorrente.getNome() );
    stringBuffer.append(TEXT_154);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_155);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_156);
    stringBuffer.append( relCorrente.getNomePropriedade() );
    stringBuffer.append(TEXT_157);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_158);
    
		}
		
    stringBuffer.append(TEXT_159);
    
	// *****  Somente associativas ********
	if (classe.isAssociativa()) {
	List<RelacionamentoWrapper> relac = classe.obtemListaComChaveEstrangeira();
	RelacionamentoWrapper rel1 = relac.get(0);
	RelacionamentoWrapper rel2 = relac.get(1);
	
    stringBuffer.append(TEXT_160);
    stringBuffer.append( rel1.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append( rel1.getNomeRelacionamento() );
    stringBuffer.append(TEXT_161);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_162);
    stringBuffer.append( rel1.getNome() );
    stringBuffer.append(TEXT_163);
    stringBuffer.append( rel2.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append(TEXT_164);
    stringBuffer.append( rel2.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append(TEXT_165);
    stringBuffer.append( rel2.getNomeRelacionamento() );
    stringBuffer.append(TEXT_166);
    stringBuffer.append( classe.getChaveW().getNomePropriedade() );
    stringBuffer.append(TEXT_167);
    stringBuffer.append( rel2.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append(TEXT_168);
    stringBuffer.append( rel1.getNomeRelacionamento() );
    stringBuffer.append(TEXT_169);
    stringBuffer.append( rel2.getClasseOposta().getIdentificadorW().getNomePropriedade() );
    stringBuffer.append(TEXT_170);
    stringBuffer.append( rel2.getClasseOposta().getChaveW().getNomePropriedade() );
    stringBuffer.append(TEXT_171);
    stringBuffer.append( rel2.getClasseOposta().getChaveW().getNomePropriedade() );
    stringBuffer.append(TEXT_172);
    stringBuffer.append( rel2.getClasseOposta().getIdentificadorW().getNomePropriedade() );
    stringBuffer.append(TEXT_173);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_174);
    stringBuffer.append( rel2.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append( rel2.getNomeRelacionamento() );
    stringBuffer.append(TEXT_175);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_176);
    stringBuffer.append( rel2.getNome() );
    stringBuffer.append(TEXT_177);
    stringBuffer.append( rel1.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append(TEXT_178);
    stringBuffer.append( rel1.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append(TEXT_179);
    stringBuffer.append( rel1.getNomeRelacionamento() );
    stringBuffer.append(TEXT_180);
    stringBuffer.append( classe.getChaveW().getNomePropriedade() );
    stringBuffer.append(TEXT_181);
    stringBuffer.append( rel1.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append(TEXT_182);
    stringBuffer.append( rel2.getNomeRelacionamento() );
    stringBuffer.append(TEXT_183);
    stringBuffer.append( rel1.getClasseOposta().getIdentificadorW().getNomePropriedade() );
    stringBuffer.append(TEXT_184);
    stringBuffer.append( rel1.getClasseOposta().getChaveW().getNomePropriedade() );
    stringBuffer.append(TEXT_185);
    stringBuffer.append( rel1.getClasseOposta().getChaveW().getNomePropriedade() );
    stringBuffer.append(TEXT_186);
    stringBuffer.append( rel1.getClasseOposta().getIdentificadorW().getNomePropriedade() );
    stringBuffer.append(TEXT_187);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_188);
    
	}
	
    stringBuffer.append(TEXT_189);
    stringBuffer.append(TEXT_190);
    return stringBuffer.toString();
  }
}
