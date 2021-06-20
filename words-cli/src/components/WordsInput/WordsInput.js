import React from "react";
import axios from "axios";
import Button from "@material-ui/core/Button";
import TextField from "@material-ui/core/TextField";

export default class WordsInput extends React.Component {
  state = {
    name: "",
  };

  handleChange = (event) => {
    this.setState({ name: event.target.value });
  };

  handleSubmit = (event) => {
    event.preventDefault();

    const user = {
      name: this.state.name,
    };

    axios.post(`/users`, { user }).then((res) => {
      console.log(res);
      console.log(res.data);
    });
  };

  render() {
    return (
      <div>
        <form onSubmit={this.handleSubmit}>
          <TextField
            id="outlined-full-width"
            placeholder="Word"
            type="text"
            name="name"
            onChange={this.handleChange}
            style={{ margin: 8 }}
            label="Write your word here!"
            fullWidth
            margin="normal"
            variant="outlined"
          />
          <Button
            variant="contained"
            type="submit"
            color="primary"
            disableElevation
          >
            Save
          </Button>
        </form>
      </div>
    );
  }
}
