package pack1;
import pack1.Message;


public class VoiceMessage extends Message {
	
	// global parameters
	private String voiceSrc;
	private boolean isDownloaded = false;
	
	public VoiceMessage(String voiceSrc){
		super();
		this.voiceSrc = voiceSrc;
		this.isDownloaded = false;
	}
	
	// getters
	public String getVoiceSrc(){
		return voiceSrc;
	}
	
	public boolean getIsDownloaded(){
		return isDownloaded;
	}
	
	// setters
	public void setVoiceSrc(String voiceSrc){
		this.voiceSrc = voiceSrc;
	}
	
	public void setIsDownloaded(boolean isDownloaded){
		this.isDownloaded = isDownloaded;
	}
	
	public String toString(){
		return super.toString()+" voice src - "+voiceSrc+" is downloaded - "+isDownloaded;
	}
}
