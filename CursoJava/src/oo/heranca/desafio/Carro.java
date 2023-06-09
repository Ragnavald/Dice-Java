package oo.heranca.desafio;

public class Carro {
	
	final int maxSpeed;
	private double currentSpeed;
	private double accelerationFactor;
	private double brakingFactor;
	
	Carro(int maxspeed){
		maxSpeed = maxspeed;
	}
	
	
	public double getSpeed() {
		
		return currentSpeed;
	}
	
	public void speedUp() {
		
		if(currentSpeed + getAccelerationFactor() < maxSpeed) {
			currentSpeed += getAccelerationFactor();
		}else {
			currentSpeed = maxSpeed;
		}
		
	}
	public void breakSpeed() {
		
		if (currentSpeed >= getBrakingFactor()) {
			currentSpeed -= getBrakingFactor();
		}else {
			currentSpeed = 0;
		}
		
	}


	public double getBrakingFactor() {
		return brakingFactor;
	}


	public void setBrakingFactor(double brakingFactor) {
		this.brakingFactor = brakingFactor;
	}


	public double getAccelerationFactor() {
		return accelerationFactor;
	}


	public void setAccelerationFactor(double accelerationFactor) {
		this.accelerationFactor = accelerationFactor;
	}
	
	
	
	
}
