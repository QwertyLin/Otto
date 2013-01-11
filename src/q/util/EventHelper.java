package q.util;

import com.squareup.otto.Bus;

/**
 * @author Administrator
 * 
 * 监听器的应用可以减少模块间代码的耦合度, 使代码结构更加清晰. 实现所谓的"职责分离"
 *
 */
public final class EventHelper {

	private static Bus BUS;
	
	public static final Bus get(){
		if(BUS == null){
			BUS = new Bus();
		}
		return BUS;
	}
	
	private EventHelper(){}
}
