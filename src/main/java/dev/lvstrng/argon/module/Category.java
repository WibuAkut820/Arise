package dev.lvstrng.argon.module;

import dev.lvstrng.argon.utils.EncryptedString;

public enum Category {
	COMBAT(EncryptedString.of("Crystal Module")),
	MISC(EncryptedString.of("ETC")),
	RENDER(EncryptedString.of("Aura Farming")),
	CLIENT(EncryptedString.of("Sex"));
	public final CharSequence name;

	Category(CharSequence name) {
		this.name = name;
	}
}
