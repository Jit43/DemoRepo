package com.sattrix.apiconsume.main;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.json.JSONObject;

public class ResultMain {
	
	public static void main(String args[])
	{
		Client client = ClientBuilder.newClient();
		String targetURI="http://192.168.21.38:8080/partnerportal/api/v1/allaccount";
		String payload="{\"startDate\":\"\",\"endDate\":\"\",\"pagenumber\":\"LScIAdp/lJZTiZ6PowuX9V7xyRkCdP/BqeOuNft6XITdM4M6FbUiHegKKTpBWDHmACxE4+Sc1xOfDJm1s9KPTLb0kAhRZmfIBLoB2IDvKxx7Xb4h8TP8v9m9lIg4gP8Obh3uU9Jaqlk66/JC/JI2VivKuqt1Jweu5KNRAA9kmVDmkYYlqFiheliXi/sVyFa8ABw4aIwSMydKAtYGQZUTLQwIhLVqbeIz+jrJc5IPXPvMDyPfRLqpeQ1GkPWrDvwKnDAEikaPIBK9GdSBqzsKoqvsVJTyydfXRy7OHd0Z3g/K5MVp++KPfU5ybIIcidLwc+XuTzP4CRF6ACG19jMTjA==\",\"pagesize\":\"A/8sBvyFTT8twXpjgRCIh7q/0DLDqJvzRtVe7s3hAYCI7KvQ4mGdYbwRUa37d7APDKRPJSZUqy57OtkuUCAYmWw6clCsNjQXNsPNyGQEE9pBhsWLWPpeUePvc4vfvWrDdEiCeYgo99fLv3VjnEDRdUpnnT2CmmzzV3p9FX+ObpKduJxCuiNtv+370b/1cL50KQj4diu/bAXnzurGKdafXPbP6KnBDsTM0TFnJQEsQeX5RGvcWQlG+mD1mC9R/WccqkwcXbcz/UhSSphR1rPxR2qtkgSDFC8d4otgSLXRhOctz3xBpKgwhSmikjtzarLeVFX0pdSRGjYQKvjDRaBNaA==\",\"PartnerId\":\"MMsBBxnoQNq49KEN+eEIRvj2Ij/AevoMUwia7agVWH7dLYUpiFKdWEZm75AfEX9eu4tZAaaFdJXFfHsjGsa4tZ7IPvsBONoCVKLpnIs654xoV6/UPZ662zqra0VXnup4oNg6iYwY+LFDkpedGhfPAZ7oH4xJ6OKdbA1nR/iz/47RcYTrjx6k1wCmy7H1NsYqOutz12U4uxOIy+U/U9kJZf6B2xiv5+NeTplenHZk9ZigmYGRVdzsYrh+/z2nJXxrOYVqnE8Jw+fLYNZieQI9Vw691eXIYIwLiE+rfUS0jQJ3zDzkaIyhgoKniTTtzd5Qxm/LGHMhp4nyuajkK3sM5A==\",\"compId\":\"AJNQKAyxdFlXIJlfmkdU3NGlMqo6ZW1cP9cDhb8tMsswq4eVWB5LPbW/RnrEPiHsUbJzfkbRqWH+5s8V7iJ7HOeqWRb/YG5KpwjvSUdfqq1z6ZfJoKeyecM+2BC42zMM6g0zY7T0SNnRtCI8aLuEhEy1zKXlOBhoJ1HOclEvKnrfkDBNV7SuH3H0AhwStG+keN97yP75PPqGBhEvp3OJIMSB6KxW8qw+L48k1sOk1Inl06YH3uKdZBwppH5dpwm47cW+yqWKtuzKorw2t2UnAuId07aExcEjB/Zp+XWyNq40S779+1DbrZRKhP0UynEmREKKwDExzV4TyhDrPUgzZQ==\",\"roleId\":\"FW3ykUam1wCvzPff8bHjCRKC6ChVkTTrKGSydHLR3HcmsuTORWPx/FoI9Yy+2JCS4qflPw4ZYOmygzG2J+jih3/3MRKTA8ZYxN8Q6F6YltsQVQ1XdjTnm6OX61oHKQhQtVjEaJJEFCsqeBIN+JS+Nk3uKfGcEetFmrUwepBYtQdfB06FaYk4iPzwIqcw2MzOt0m6IhTes3YBa5dFKVD2L59p6TJgWkyuNoJiO0N0cgf/Nv7MuJBpfpWIdPctXclywoqQq1J3hjr2IYf0xZfOhztcfmfRJJ1f7JWkPOFZ2LV7tV/zbxS5apu4mRm397Y9Jmd999VLI3CubTAViq3gsg==\",\"userId\":\"E5Mg2MgZY93ZIBbC+6ICp2FMSUcZgZK/CG+kQIWM/I4YMGobL9TFWR5g/J1ohyvpQzdrFUNqKV+l+aa4F9w+FwQ6HwBIZ5GHfmcwPaTU1TobWOpg9YTWxzDUooY+zTuWS7uwuU4+aNRce3A8APjJKwHRBN7dLmjzm6ATbsNYSzUpqcAX7Iv0VinlVhFs2gQKm/gdG6Sod+X+0BG1lTndUkQQmacM7Hz4J2DZZO4I3oa3U1mwYhql+urRN0gOxE8YlO5MGx/AsbHvkboNRgwiUFpSfkwdUCJJ2X6vdnzT+Zeh+V7z9mwAZqwkZWMgDpzHpFCcc1oY6vb5UfeVTGfQNA==\",\"isPartner\":\"OK3ZA7MTEBpsmocmQC5R0z5Gy5Cz7I9Muc8pvKjV/yQ3D74qY/dD+ApNa0o3uOrWxOuyQ/nN4q9XV8GXN8OKYfAUMsNTOeQuRUfwvAupLzbhsVn1eTl1qlXXisR2u/4pMuVK751X6CbV8Z9jqHF50NasGPgKglqFu6wJkU8eFf7ae896ybwl27DP2cfdVX8QCgwJ0o5CEYeDG58SPTmcHiX9hssa9ZpydejWNZHGkQLoWnCeO8CzI3v/mubqejcBQH378d0UeB22w2nLJ4V/FLvpJSg6YXeJH8ghQ/+ZZtiLZ3W1mxJEk7lfHSq73ulbwa4WgIGb0Nkxnj1GGS6cSA==\"}";
		
		Entity<String> entity = Entity.text(payload);
		String data;
		data= client.target(targetURI)
				.request(MediaType.APPLICATION_JSON,MediaType.TEXT_PLAIN).post(entity,String.class);

		JSONObject obj = new JSONObject(data);
//		JSONObject arr = obj.getJSONArray("responseData").getJSONObject(0);
		
		System.out.println();
		System.out.println(obj);
		
	}

}
