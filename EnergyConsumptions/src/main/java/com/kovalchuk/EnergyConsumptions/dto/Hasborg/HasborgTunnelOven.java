package com.kovalchuk.EnergyConsumptions.dto.Hasborg;

import java.util.Date;

import com.kovalchuk.EnergyConsumptions.dto.ElectricPowerAndGasConsuption;

import lombok.Data;

@Data
public class HasborgTunnelOven {
	
	private Long id;
	
	private Date dateTime;
	
	private ElectricPowerAndGasConsuption electricPowerAndGasConsuption;

}
