import "./App.css";
// import Typography from "@material-ui/core/Typography";
// import Container from "@material-ui/core/Container";
// import TextField from "@material-ui/core/TextField";
// import logo from "./logo.svg";
// import Button from "@material-ui/core/Button";
import WordsTable from "./components/WordsTable/WordsTable";
import WordsInput from "./components/WordsInput/WordsInput";
import axios from "axios";

// axios.defaults.baseURL = "http://localhost:9000/";
axios.defaults.baseURL = "https://jsonplaceholder.typicode.com";

function App() {
  return (
    <div className="App">
      <header className="App-header">
        {/* <img src={logo} className="App-logo" alt="logo" /> */}
        <h2>Words</h2>
        {/* <Container maxWidth="sm"> */}
        {/* <Typography
            component="div"
            style={{ backgroundColor: "#cfe8fc", height: "100vh" }}
          /> */}
        {/* <TextField
            id="outlined-full-width"
            placeholder="Word"
            style={{ margin: 8 }}
            label="Write your word here!"
            fullWidth
            margin="normal"
            variant="outlined"
          /> */}
        {/* </Container> */}
        <WordsInput></WordsInput>
        <WordsTable></WordsTable>
      </header>
    </div>
  );
}

export default App;
