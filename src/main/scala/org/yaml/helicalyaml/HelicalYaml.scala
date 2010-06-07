package org.yaml.helicalyaml

import org.yaml.snakeyaml._
import org.yaml.snakeyaml.representer._
import org.yaml.snakeyaml.nodes._
import scala.collection.JavaConversions._

class HelicalYaml  {
	val yaml = new Yaml(new Dumper(new ScalaRepresenter(), new DumperOptions()))
	
	def dump(data: Any): String = {
		yaml.dump(data)
	}
	
	def load(data: String): Any = {
		yaml.load(data)
	}

}

class ScalaRepresenter extends Representer {

  multiRepresenters.put(classOf[::[Object]], new RepresentList())

  private class RepresentList extends Represent {

    def representData(data:Object):Node = {
      val scalaList = data.asInstanceOf[List[_ <: Object]]
      return representSequence(getTag(scalaList.getClass(), Tag.SEQ), scalaList, null)
    }

  }
} 




