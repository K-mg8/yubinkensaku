package com.hoget.DTO;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data


public class ZipcodeDto {
	/** ステータス */
	public int status;
	
	/** メッセージ */
	public String message;
	
	/** 郵便番号情報リスト*/
	public List<ZipcodeResultDto> results = new ArrayList<>();
}
