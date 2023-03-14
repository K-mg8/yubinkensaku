package com.hoget.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller // アノテーションを使ってControllerクラスであることを宣言

public class HelloController {
	
	@RequestMapping(value="index") // 「/index」にリクエストがきた時に呼び出されるメソッド
	public String index() {
		return "index";
	}

}
