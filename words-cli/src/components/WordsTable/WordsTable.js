import React from "react";
import "./WordsTable.css";
import axios from "axios";

export default class WordsTable extends React.Component {
  state = {
    persons: [],
  };

  componentDidMount() {
    axios.get(`/users`).then((res) => {
      const persons = res.data;
      console.log(res);
      this.setState({ persons });
    });
  }

  render() {
    return (
      <ol>
        {this.state.persons.map((person) => (
          <li key={person.id}>{person.username}</li>
        ))}
      </ol>
    );
  }
}
