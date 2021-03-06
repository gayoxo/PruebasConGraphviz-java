import guru.nidi.graphviz.engine.Format;
import guru.nidi.graphviz.engine.Graphviz;
import guru.nidi.graphviz.model.Graph;

import java.io.File;
import java.io.IOException;

import static guru.nidi.graphviz.model.Factory.*;


public class Principal {

	public static void main(String[] args) {
		Graph g = graph("example1").directed().with(node("a").link(node("b")));
		try {
			Graphviz.fromGraph(g).width(200).render(Format.PNG).toFile(new File("/tmp/ex1.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
