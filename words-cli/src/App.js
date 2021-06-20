import "./App.css";
// import Typography from "@material-ui/core/Typography";
import Container from "@material-ui/core/Container";
import TextField from "@material-ui/core/TextField";
import logo from "./logo.svg";
import Button from "@material-ui/core/Button";

function App() {
  return (
    <div className="App">
      <header className="App-header">
        <img src={logo} className="App-logo" alt="logo" />
        <p>Words</p>
        <Container maxWidth="sm">
          {/* <Typography
            component="div"
            style={{ backgroundColor: "#cfe8fc", height: "100vh" }}
          /> */}
          <TextField
            id="outlined-full-width"
            placeholder="Word"
            style={{ margin: 8 }}
            label="Write your word here!"
            fullWidth
            margin="normal"
            variant="outlined"
          />
        </Container>
        <Button variant="contained" color="primary" disableElevation>
          Save
        </Button>
        <p>Your words will appear here.</p>
      </header>
    </div>
  );
}

export default App;
