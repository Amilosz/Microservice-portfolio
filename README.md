# Microservice-portfolio

App for generating programmer portfolio using Github and Joke-official API.

## **Endpoints:**

### Eureka server:
*localhost:8761*

### Main application:
*localhost:9000*

### Joke-official

Returns json data joke.
- **URL**
*localhost:8083/main/joke*

- **Method:**

	GET
- **Success Response:**

	Code: 200
	Content: { 
	"setup":"How many kids with ADD does it take to change a lightbulb?",
	"punchline":"Let's go ride bikes!"
	}

### Github

Returns json data about user projects.

- **URL**

	*localhost:8083/main/project/:useId*

- **Method:**

	GET

- **URL Params**

	**Required:**

	useId=[string]

- **Success Response:**

	Code: 200
	Content: [{"name":"Amilosz.github.io","stargazers_count":"0","html_url":"https://github.com/Amilosz/Amilosz.github.io","language":"HTML"},{"name":"Design-Patterns","stargazers_count":"1","html_url":"https://github.com/Amilosz/Design-Patterns","language":"Java"},{"name":"JavaEE","stargazers_count":"1","html_url":"https://github.com/Amilosz/JavaEE","language":"Java"},{"name":"micro-template","stargazers_count":"0","html_url":"https://github.com/Amilosz/micro-template","language":"Python"},{"name":"Microservice-portfolio","stargazers_count":"1","html_url":"https://github.com/Amilosz/Microservice-portfolio","language":"Java"},{"name":"MyWallet","stargazers_count":"1","html_url":"https://github.com/Amilosz/MyWallet","language":"Java"},{"name":"Portfolio","stargazers_count":"1","html_url":"https://github.com/Amilosz/Portfolio","language":"JavaScript"},{"name":"springStart","stargazers_count":"1","html_url":"https://github.com/Amilosz/springStart","language":"Java"}]



