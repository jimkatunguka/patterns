package counter;

import org.w3c.dom.css.Rect;

public class Counter extends Subject{
	CounterState state;
	
	private int count=0;
	private TextFrame textFrame;
	private OvalFrame ovalFrame;
	private RectFrame rectFrame;

	
	public void increment(){
		count = state.increment();
    	donotify(count);
	}
	
	public void decrement(){
		count--;
    	donotify(count);
	}

	public void setTestFrame(TextFrame textFrame){
		this.textFrame = textFrame;
	}

	public void setOvalFrame(OvalFrame ovalFrame){
		this.ovalFrame = ovalFrame;
	}

	public void setRectFrame(RectFrame rectFrame){
		this.rectFrame = rectFrame;
	}

	public void setState(CounterState state){
		this.state = state;
	}

	public void setCount(int count){
		this.count = count;
	}

	public int getCount(){
		return  count;
	}





}
