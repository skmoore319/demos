export class Pizza {
  private name: string;
  size: string; // public by default
  protected probablyWontUse: any = 'more common in libraries than your code';

  constructor(name: string, size: string) {
    this.name = name;
    this.size = size;
  }

  getName(): string {
    return this.name;
  }

  setName(name: string) {
    this.name = name;
  }

  getSize(): string {
    return this.size;
  }

  setSize(size: string) {
    this.size = size;
  }

}

